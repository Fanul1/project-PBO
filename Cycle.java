public class Cycle extends Vehicle
{
    public int noplat;
    
    public Cycle(int np) {
        this.noplat=np;
    }
    public void tersedia(){
        if (noplat == 0) {
            System.out.println("Motor tidak tersedia");
        }else {
            System.out.println("Motor tersedia");
        }
    }

    public int getNoplat() {
        return noplat;
    }
}
