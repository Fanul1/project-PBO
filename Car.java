public class Car extends Driver{
    public int noplat;
    
    public Car(String nm, String gen, int np) {
        super(nm, gen);
        this.noplat=np;
    }
    public void tersedia(){
        if (noplat == 0) {
            System.out.println("Tidak tersedia");
        }else {
            System.out.println("Tersedia");
        }
    }
}