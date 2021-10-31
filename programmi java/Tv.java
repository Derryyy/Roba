public class Tv
{
    private int channel;
    private int volume;
    private int inches;
    private String model;
    private String color;
    private boolean on;

    public Tv(Integer Channel, Integer Volume, Integer Inches, String Model, String Color, Boolean On)
    {
        channel = Channel;
        volume = Volume;
        inches = Inches;
        model = Model;
        color = Color;
        on = On;
    }

    /*
    public int SetChannel()
    {
        return channel;
    }

    public int SetVolume()
    {
        return volume;
    }

    public int GetInches()
    {
        return inches;
    }

    public String Model()
    {
        return model;
    }

    public String Color()
    {
        return color;
    }

    public boolean On()
    {
        return on;
    }
    */
    
    public String toString()
    {
        return "Canale: " + channel + " - " + "Volume: " + volume + " - " + "Pollici: " + inches + " - " + "Colore: " + color + " - " + "Modello: " + model + " - " + "Acceso: " + on;
    }
    
    public static void main (String args [])
    {
        Tv television = new Tv(10, 50, 55, "Sony", "Black", true);
        
        System.out.println(television.toString());
    }
}