public class Driver
{
    private String nama;
    private String gender;

    private Car mobil;

    private Cycle motor;


    public Driver (String nm, String gen) {
        this.nama = nm;
        this.gender = gen;
    }
    public void addCar(int np){
         this.mobil = new Car(np);
    }

    public Car getCar() {
        return mobil;
    }

    public void addCycle(int np) {
        this.motor = new Cycle(np);
    }

    public Cycle getCycle() {
        return motor;
    }

    public String getNama() {
        return nama;
    }
}
