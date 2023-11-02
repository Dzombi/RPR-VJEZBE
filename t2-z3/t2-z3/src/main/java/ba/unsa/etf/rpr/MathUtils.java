package ba.unsa.etf.rpr;
import java.util.List;

public class MathUtils {
    public static Double min(List<Double> brojevi){
        double min= Double.MAX_VALUE;
        for(Double broj: brojevi) {
            if(broj.doubleValue()<min){
                min=broj.doubleValue();
            }
        }
        return min;
    }

    public static Double max(List<Double> brojevi){
        double max= Double.MIN_VALUE;
        for(Double broj: brojevi) {
            if(broj.doubleValue()>max){
                max=broj.doubleValue();
            }
        }
        return max;
    }

    public static Double mean(List<Double> brojevi){
        double sum=0;
        for(Double broj:brojevi){
            sum+=broj.doubleValue();
        }
        return sum/brojevi.size();
    }

    public static Double stdev(List<Double> brojevi){
        Double mean=MathUtils.mean(brojevi);
        float standarDeviation=0;
        for(Double broj:brojevi){
            standarDeviation+=Math.pow(broj-mean,2);
        }
        return Math.sqrt(standarDeviation/brojevi.size());
    }
}
