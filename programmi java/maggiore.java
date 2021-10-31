import java.util.Scanner;

class maggiore
{
public static void main (String[] args)
{
    Scanner in=new Scanner(System.in);
    int x,ma=0,mi, cont = 0;
    System.out.print("inserisci numero:");
    x=in.nextInt();
    ma=mi=x;
    for(cont++; cont<=3;)
    {
        System.out.print("ins.num:");
        x=in.nextInt();
        if(x > ma)ma=x;
        if(x < mi && x!=0)mi=x;
    } 
    in.close();
    System.out.print("max:"+ma);
}
}