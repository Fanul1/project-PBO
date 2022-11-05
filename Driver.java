public abstract class Driver
{
    private String nama;
    private String gender;


    public Driver (String nm, String gen) {
        System.out.println("Terima kasih telah memesan driver ini");
        this.nama = nm;
        this.gender = gen;
    }
    public abstract void tersedia();
    public String toString(){
        return "Terima kasih telah memesan"+this.nama+"Gender"+this.gender;
    }
}
