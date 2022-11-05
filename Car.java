public class Car extends Vehicle{
    public int noplat;
    
    public Car(int np) {
        this.noplat=np;
    }
    public void tersedia(){
        if (noplat == 0) {
            System.out.println("Mobil Tidak tersedia");
        }else {
            System.out.println("Mobil tersedia");
        }
    }
}