import java.util.ArrayList;
import java.util.Scanner;

public class Order
{
    //Constractor class order
    public Order()
    {
        ArrayList<Driver> pengemudi = new ArrayList<>();
        ArrayList<Car> mobil = new ArrayList<>();
        ArrayList<Cycle> motor = new ArrayList<>();


        pengemudi.add(new Driver("Asep", "L"));
        pengemudi.add(new Driver("Rita", "P"));
        pengemudi.add(new Driver("Putin", "L"));
        pengemudi.add(new Driver("Naruto", "L"));
        pengemudi.add(new Driver("Budi", "L"));
        pengemudi.add(new Driver("Susi", "P"));
        pengemudi.add(new Driver("Yanto", "L"));
        pengemudi.add(new Driver("Debi", "P"));
        pengemudi.add(new Driver("Susanti", "P"));
        pengemudi.add(new Driver("Bambang", "L"));

        for(int i = 0; i<=10; i++)
        {
            if(i < 6) {
                pengemudi.get(i).addCar(i);;
            }
            else{
                pengemudi.get(i).addCycle(i);
            }

        }
    }
    public static void tujuan(){
        System.out.println("Pilihan tujuan:");
        System.out.println("1. Darussalam");
        System.out.println("2. Ulee Kareng");
        System.out.println("3. Masjid Raya Baiturrahman");
        System.out.println("4. Ulee Lheu");
        System.out.println("5. Lueng Bata");
    }

    public static void main(String[] args) {
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
        

    }
}
