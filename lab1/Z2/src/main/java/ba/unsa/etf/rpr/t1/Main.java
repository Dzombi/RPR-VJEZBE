package ba.unsa.etf.rpr.t1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                int n;
                Scanner ulaz = new Scanner(System.in);
                System.out.println("Unesite broj n: ");
                n = ulaz.nextInt();
                for (int i=1;i<=n;i++){
                    if(i%sumaCifara(i)==0){
                        System.out.println(i+" ");
                    }
                }
    }
    public static int sumaCifara(int n){
        int x=n;
        int suma=0;
        while(x!=0){
            suma= suma + (x%10);
            x=x/10;
        }
        return suma;
    }
}
