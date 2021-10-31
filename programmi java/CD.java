public class CD
{
    public String autore;
    public String titolo;
    public Integer nBrani;
    public Double durata;

    CD(String a, String t, Integer n, Double d)
    {
        autore = a;
        titolo = t;
        nBrani = n;
        durata = d;
    }

    public String toString()
    {
        return autore + "," + titolo + "," + nBrani + "," + durata;
    }

    public static void main(String args[])
    {
        CD disco1 = new CD("Sia", "Unstoppable", 5, 10.0);
        System.out.println(disco1.toString());
    }
}