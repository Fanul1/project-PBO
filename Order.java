import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * Program Ojek Online
 * @author Ridho Ferdiansa and Fanul Nastia
 * @version 1.0
 */
public class Order
{
    //Method order tentang kesrluruhan proses pemesanan
    public static void order()
    {
        //Arraylist yang akan menyimpan daftar pengemudi
        ArrayList<Driver> pengemudi = new ArrayList<>();

        pengemudi.add(new Driver("", ""));
        pengemudi.add(new Driver("Asep", "L"));
        pengemudi.add(new Driver("Rita", "P"));
        pengemudi.add(new Driver("Putin", "L"));
        pengemudi.add(new Driver("Naruto", "L"));
        pengemudi.add(new Driver("Budi", "L"));
        pengemudi.add(new Driver("", ""));
        pengemudi.add(new Driver("Susi", "P"));
        pengemudi.add(new Driver("Yanto", "L"));
        pengemudi.add(new Driver("Debi", "P"));
        pengemudi.add(new Driver("Susanti", "P"));
        pengemudi.add(new Driver("Bambang", "L"));

        for(int i = 0; i<=11; i++)
        {
            if(i < 6) {
                pengemudi.get(i).addCar(i);
            }
            else{
                if(i == 6){
                    pengemudi.get(i).addCycle(0);
                }
                pengemudi.get(i).addCycle(i);
            }
        }

        Random acak = new Random();
        Scanner in = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Pemesanan  Ojek online");
        System.out.print("Masukkan nama anda: ");
        String name = in.nextLine();
        c.setName(name);
        System.out.print("Masukkan gender: ");
        String gen = in.nextLine();
        c.setGender(gen);
        tujuan();
        System.out.print("Masukkan nomor tujuan anda: ");
        int tj = in.nextInt();
        switch (tj) {
            case 1:
                System.out.println("Tujuan Darussalam");
                System.out.println("Harga 10rb");
                break;
            case 2:
                System.out.println("Tujuan Ulee Kareng");
                System.out.println("Harga 12rb");
                break;
            case 3:
                System.out.println("Tujuan Masjid Raya Baiturrahman");
                System.out.println("Harga 20rb");
                break;
            case 4:
                System.out.println("Tujuan Ulee Lheu");
                System.out.println("Harga 30rb");
                break;
            case 5:
                System.out.println("Tujuan Lueng Bata");
                System.out.println("Harga 15rb");
                break;
            default:
                break;
        }

        System.out.println("Pilihan kendaraan :\n1. mobil\n2. motor");
        System.out.print("Masukkan nomor pilihan kendaraan : ");
        int pilih = in.nextInt();

        if(pilih == 1){
            int i = acak.nextInt(5);
            pengemudi.get(i).getCar().tersedia();
            if(pengemudi.get(i).getCar().getNoplat() == 0)
            {
                System.out.println("Maaf kendaraaan yang ingin anda pesan sedang tidak tersedia, coba beberapa saat lagi.\n\n");
                tunggu();
                order();
            }
            System.out.println("Nama pengemudi :" + pengemudi.get(i).getNama() + " dengan no plat " + pengemudi.get(i).getCar().getNoplat());
        }
        else if(pilih == 2)
        {
            int i = acak.nextInt(5) + 6;
            pengemudi.get(i).getCycle().tersedia();
            if(pengemudi.get(i).getCycle().getNoplat() == 0)
            {
                System.out.println("Maaf kendaraaan yang ingin anda pesan sedang tidak tersedia, coba beberapa saat lagi.\n\n");
                tunggu();
                order();
            }
            System.out.println("Nama pengemudi :" + pengemudi.get(i).getNama() + " dengan no plat " + pengemudi.get(i).getCycle().getNoplat());
        }
        System.out.println("Pengemudi akan sampai beberapa saat lagi");

        tunggu();
        System.out.println("Pengemudi sampai");
        System.out.println("Selamat menikmati perjalanan");
        tunggu();
        System.out.println("Anda telah sampai ditujuan");
        System.out.printf("Terima kasih " +c.getName(name)+ "("+c.getGender(gen)+") sudah menggunakan layanan kami");
        in.close();

    }
    /**
     * Menu lokasi yang dituju
     */
    public static void tujuan(){

        System.out.println("Pilihan tujuan:");
        System.out.println("1. Darussalam");
        System.out.println("2. Ulee Kareng");
        System.out.println("3. Masjid Raya Baiturrahman");
        System.out.println("4. Ulee Lheu");
        System.out.println("5. Lueng Bata");
    }
    /**
     * Waiting Time
     */
    static void tunggu(){
        System.out.println("\n.\n.\n.");
        TimeUnit time = TimeUnit.SECONDS;
        try{
            time.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("..");
        }
    }
    /**
     * Main utama dari program
     * @param args argumen
     */
    public static void main(String[] args) {
        order();
    }

}
