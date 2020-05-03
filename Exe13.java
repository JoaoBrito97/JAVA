import java.util.Scanner;
import java.util.Locale;

public class Exe13 {
    public static void main(String[] args){
        double x, y ;
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("VALOR DE X: ");
        x = leia.nextDouble();
        System.out.print("VALOR DE Y: ");
        y = leia.nextDouble();
        if(x == 0 && y == 0){
            System.out.println("ORIGEM");
        }else if(x > 0 && y > 0){
            System.out.println("QUADRANTE 1");
        }else if(x < 0 && y > 0){
            System.out.println("QUADRANTE 2");
        }else if(x < 0 && y < 0){
            System.out.println("QUADRANTE 3");
        }else{
            System.out.println("QUADRANTE 4");
        }
    }
}
