import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order
{
    //Constractor class order
    public Order()
    {
        ArrayList<Driver> pengemudi = new ArrayList<>();
        ArrayList<Vehicle> Kendaraan = new ArrayList<>();

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
                Kendaraan.add(i, new Car(i));
            }
            else{
                Kendaraan.add(i, new Cycle(i));
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Pemesenan  Ojek online");
    }
}
