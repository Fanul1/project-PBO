public class Customer
{
    private String nama;
    private String gender;
    private String tujuan;

    public Customer(String nama, String gender, String tujuan) {
        this.nama = nama;
        this.gender = gender;
        this.tujuan = tujuan;
    }
    public String getName() {
        return nama;
    }
    public String getGender() {
        return gender;
    }
    public String getTujuan() {
        return tujuan;
    }
}
