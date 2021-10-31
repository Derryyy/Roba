import java.util.Scanner;

public class Cerchio
{
    
    private static double raggio;
    
    public static double CalcolaArea(double r)
    {
        double area = Math.PI*(r*r);
        return area;
    }
    
    private static double CalcolaPerimetro(double r)
    {
        double perimetro = 2*Math.PI*r;
        return perimetro;
    }
    
    private static void StampaValori(double r)
    {       
        System.out.println("Perimetro: " + CalcolaPerimetro(r) + "\n" + "Area: " + CalcolaArea(r));
    }
    
    public static void main(String [] args)
    {     

        Scanner in = new Scanner(System.in);
        System.out.print("Inserire il raggio: ");
        raggio = in.nextInt();

        StampaValori(raggio);
    }
}