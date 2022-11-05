import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Order
{
    //Constractor class order
    public static void order()
    {
        ArrayList<Driver> pengemudi = new ArrayList<>();
        ArrayList<Car> mobil = new ArrayList<>();
        ArrayList<Cycle> motor = new ArrayList<>();


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
                pengemudi.get(i).addCar(i);;
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
        System.out.println("Pemesanan  Ojek online");
        System.out.print("Masukkan nama anda: ");
        String name = in.nextLine();
        System.out.print("Masukkan gender");
        String gen = in.nextLine();
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
                System.out.println("Tujuan Masjid Raya ");
                System.out.println("Harga 10rb");
                break;
            case 4:
                System.out.println("Tujuan Darussalam");
                System.out.println("Harga 10rb");
                break;
            case 5:
                System.out.println("Tujuan Darussalam");
                System.out.println("Harga 10rb");
                break;
            default:
                break;
        }
        Customer c = new Customer(name, gen);

        System.out.println("Pilihan kendaraan :\n1. mobil\n2. motor");
        System.out.print("Masukkan nomor pilihan kendaraan : ");
        int pilih = in.nextInt();

        if(pilih == 1){
            int i = acak.nextInt(5);
            pengemudi.get(i).getCar().tersedia();
            System.out.println("Nama pengemudi :" + pengemudi.get(i).getNama() + " dengan no plat " + pengemudi.get(i).getCar().getNoplat());
        }
        else if(pilih == 2)
        {
            int i = acak.nextInt(5) + 6;
            pengemudi.get(i).getCycle().tersedia();
            System.out.println("Nama pengemudi :" + pengemudi.get(i).getNama() + " dengan no plat " + pengemudi.get(i).getCycle().getNoplat());
        }
        System.out.println("Pengemudi akan sampai beberapa saat lagi");

        tunggu(5);
        System.out.println("Pengemudi sampai");
        System.out.println("Selamat menikmati perjalanan");
        tunggu(5);
        System.out.println("Anda telah sampai ditujuan");
        System.out.println("Terimak kasih sudah menggunkan layanan kami");


    }
    public static void tujuan(){

        System.out.println("Pilihan tujuan:");
        System.out.println("1. Darussalam");
        System.out.println("2. Ulee Kareng");
        System.out.println("3. Masjid Raya Baiturrahman");
        System.out.println("4. Ulee Lheu");
        System.out.println("5. Lueng Bata");
    }

    static void tunggu(int i){
        System.out.println("\n.\n.\n.");
        TimeUnit time = TimeUnit.SECONDS;
        try{
            time.sleep(i);
        }
        catch(InterruptedException e){}

    }

    public static void main(String[] args) {
        order();


    }

}
