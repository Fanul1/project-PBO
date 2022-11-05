public class Driver
{
    private String nama;
    private String gender;


    public Driver (String nm, String gen) {
        this.nama = nm;
        this.gender = gen;
    }
    public String toString(){
        return "Terima kasih telah memesan"+this.nama+"Gender"+this.gender;
    }
}
