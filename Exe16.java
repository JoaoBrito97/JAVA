import java.util.Locale;
import java.util.Scanner;

public class Exe16 {
        public static void main(String[] args){
            double x, y ;
            Scanner leia = new Scanner(System.in);
            Locale.setDefault(Locale.US);
            while(true){

                System.out.print("VALOR DE X: ");
                x = leia.nextDouble();
                System.out.print("VALOR DE Y: ");
                y = leia.nextDouble();
                if(x == 0 && y > 0){
                    break;
                }else if(x > 0 && y > 0){
                    System.out.println("QUADRANTE 1");
                }else if(x < 0 && y > 0){
                    System.out.println("QUADRANTE 2");
                }else if(x < 0 && y < 0){
                    System.out.println("QUADRANTE 3");
                }else if(y == 0 && x > 0){
                    break;
                }else{
                    System.out.println("QUADRANTE 4");
                }

            }
        }

}
