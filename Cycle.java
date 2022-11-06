/**
 * Class Cycle inherintance dari abstract class vehicle
 * 
 */
public class Cycle extends Vehicle
{
    public int noplat;
    /**
     * Method Constructor Cycle
     */
    public Cycle(){

    }
    /**
     * Method Constructor Cycle dengan parameter
     * @param np no plat
     */
    public Cycle(int np) {
        this.noplat=np;
    }
    /**
     * Method mengecek ketersediaan
     */
    public void tersedia(){
        if (noplat == 0) {
            System.out.println("Motor tidak tersedia");
        }else {
            System.out.println("Motor tersedia");
        }
    }
    /**
     * Method mengembalikan no plat motor
     * @return no plat
     */
    public int getNoplat() {
        return noplat;
    }
}
