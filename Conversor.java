package entidades;

public class Conversor {

    public static final double IOF = 0.06;

    public static double convertReal(double cotacao, double dollares){
        return cotacao * dollares * (IOF + 1.0);
    }
}
