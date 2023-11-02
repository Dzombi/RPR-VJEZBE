package ba.unsa.etf.rpr;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner ulaz= new Scanner(System.in);
        List<Double> brojevi= new ArrayList<Double>();

        while(true){
            System.out.println("Unesite broj(stop za stopiranje): ");
            String linija=ulaz.nextLine();
            if("stop".equalsIgnoreCase(linija.trim())){
                break;
            }
            try{
                Double broj=Double.parseDouble(linija);
                brojevi.add(broj);
            }catch(Exception e){
                System.out.println("Unesena rijec nije broj");
            }
        }

        System.out.println("Rezultati:");
        System.out.println("Min: "+ MathUtils.min(brojevi));
        System.out.println("Max: "+ MathUtils.max(brojevi));
        System.out.println("Mean: "+ MathUtils.mean(brojevi));
        System.out.println("Standardna devijacija: "+ MathUtils.stdev(brojevi));
    }
}
