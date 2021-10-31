import java.util.Scanner;

public class esercizio
{
    public static void main(String args[])
    {
        int numero, cont = 0, maggiore = 0, controllo;
        Scanner in = new Scanner(System.in);
        in.close();
        System.out.println("Inserisci tre numeri:");

        do
        {
            numero = in.nextInt();
            controllo = numero;
            
            if(controllo>maggiore)
            {
                maggiore = controllo;
            }

            cont = cont+1;

        } while (cont <= 2);

        System.out.println("mAGGIORE: "+maggiore);
        
    }
}
