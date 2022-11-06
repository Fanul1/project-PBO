/**
 * Class Car inherintance dari abstract class vehicle
 * 
 */
public class Car extends Vehicle{
    public int noplat;
    /**
     * Methods Constructor Car
     * @param np no plat
     */
    public Car(int np) {
        this.noplat=np;
    }
    /**
     * Method mengecek ketersediaan
     */
    public void tersedia(){
        if (noplat == 0) {
            System.out.println("Mobil Tidak tersedia");
        }else {
            System.out.println("Mobil tersedia");
        }
    }
    /**
     * Method mengembalikan no plat mobil
     * @return no plat
     */
    public int getNoplat() {
        return noplat;
    }
}