import java.util.Scanner;
import java.util.Locale;

public class Exe20 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num;
        double a,b,c,result = 0,d = 0;
        System.out.print("NÚMERO DE TESTES: ");
        num = leia.nextInt();
        for(int i = 0; i <= num-1; i++){
            System.out.print("A: ");
            a = leia.nextDouble();
            System.out.print("B: ");
            b = leia.nextDouble();
            System.out.print("C: ");
            c = leia.nextDouble();
            result = ( a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.println(String.format("%.1f",result));

        }

    }
}
