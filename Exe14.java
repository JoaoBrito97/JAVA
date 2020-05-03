import java.util.Scanner;
import java.util.Locale;
public class Exe14 {
    public static void main(String[] args){
        double sal,novo;
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        System.out.print("SEU SALÁRIO: R$ ");
        sal = leia.nextDouble();
        novo = 0;
        if (sal <= 2000){
            System.out.println("ISENTO");
        }else if(sal <=3000){
            novo = (sal - 2000) * 8/100;
            System.out.println("R$"+String.format("%.2f",novo));

        }else if( sal <= 4500){
            novo = (sal - 3000) * 18/100 + 1000 * 8/100;
            System.out.println("R$"+String.format("%.2f",novo));
        }else{
            novo = (sal - 4500) * 28/100 + 1500 * 18/100 + 1000 * 8/100;
            System.out.println("R$"+String.format("%.2f",novo));
        }

    }
}
