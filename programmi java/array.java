import java.util.Scanner;

public class array {
    

    public static void main (String[] args)
    {
        int[] num = new int [5];
        Scanner in = new Scanner(System.in);

        System.out.println("Inserire valori:");

        for (int cont = 0; cont < 5; cont++)
        {
            num[cont] = in.nextInt();
        }

        in.close();
        System.out.println("\n--------------\n");

        for (int cont = 0; cont < 5; cont++)
        {
            System.out.println(num[cont]);
        }
    }
}
