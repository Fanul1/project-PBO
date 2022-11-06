/**
 * Class Driver
 */
public class Driver
{
    private String nama;
    private String gender;
    private Car mobil;
    private Cycle motor;
    /**
     * Method Constructor Driver
     */
    public Driver() {
        
    }
    /**
     * Method Contructor dengan parameter 
     * @param nm nama driver
     * @param gen gender driver
     */
    public Driver (String nm, String gen) {
        this.nama = nm;
        this.gender = gen;
    }
    /**
     * Method mengubah nama driver
     * @param nm nama driver
     */
    public void setName(String nm) {
        this.nama = nm;
    }
    /**
     * Method mengubah gender driver
     * @param gen gender driver
     */
    public void setGender(String gen) {
        this.gender = gen;
    }
    /**
     * Method menambah pengemudi mobil
     * @param np no plat
     */
    public void addCar(int np){
         this.mobil = new Car(np);
    }
    /**
     * Method mengembalikan pengemudi mobil
     * @return mobil
     */
    public Car getCar() {
        return mobil;
    }
    /**
     * Method menambah pengemudi motor
     * @param np no plat
     */
    public void addCycle(int np) {
        this.motor = new Cycle(np);
    }
    /**
     * Method mengembalikan pengemudi motor
     * @return motor
     */
    public Cycle getCycle() {
        return motor;
    }
    /**
     * Method mengembalikan nama pengemudi
     * @return
     */
    public String getNama() {
        return this.nama;
    }
    /**
     * Method mengembalikan gender pengemudi
     * @return
     */
    public String getGender() {
        return this.gender;
    }
}
