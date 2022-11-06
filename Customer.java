/**
 * Class Customer
 */
public class Customer
{
    public String nama;
    public String gender;
    /**
     * Method Constructor Customer
     */
    public Customer() {
        
    }
    /**
     * Method Constructor Customer dengan parameter
     * @param nama nama customer
     * @param gender gender customer
     */
    public Customer(String nama, String gender) {
        this.nama = nama;
        this.gender = gender;
    }
    /**
     * Method mengubah nama customer
     * @param nama customer
     */
    public void setName(String nama) {
        this.nama=nama;
    }
    /**
     * Method mengubah gender customer
     * @param gender customer
     */
    public void setGender(String gender) {
        this.gender=gender;
    }
    /**
     * Method mengembalikan nama customer
     * @param nama customer
     * @return customer
     */
    public String getName(String nama) {
        return this.nama = nama;
    }
    /**
     * Method mengembalikan gender customer
     * @param gender customer
     * @return customer
     */
    public String getGender(String gender) {
        return this.gender = gender;
    }
}
