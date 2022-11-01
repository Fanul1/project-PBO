
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private String nama;
    private int umur;
    private char gender;
    private Motor motor;
    private Mobil mobil;
    /**
     * Constructor for objects of class Driver
     */
    public Driver(Motor motor)
    {
        this.motor = motor;
    }
    
    public Driver(Mobil mobil)
    {
        this.mobil = mobil;
    }
    
    public boolean haveMotor()
    {
        return motor != null;
    }

    public boolean haveMobil()
    {
        return mobil != null;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

}
