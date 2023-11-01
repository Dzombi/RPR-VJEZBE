package ba.unsa.etf.rpr;

public class App 
{
    public static void main( String[] args )
    {
    int broj= Integer.parseInt(args[0]);
    System.out.println("Sinus: "+Math.sin(broj));
    int faktorijel=1;
    for(int i=1;i<=broj;i++){
        faktorijel=faktorijel*i;
    }
    System.out.println("Faktorijel: "+faktorijel);
    }
}
