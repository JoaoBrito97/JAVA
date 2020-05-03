import java.util.Scanner;
import java.util.Locale;

public class Exe21 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num;
        double numerador, denominador,r=0;
        System.out.print("DIGITE UM NÚMERO: ");
        num = leia.nextInt();
        for (int i = 0; i <= num-1; i++){
            System.out.print("NÚMERADOR: ");
            numerador = leia.nextDouble();
            System.out.print("DENOMINADOR: ");
            denominador = leia.nextDouble();
            if(numerador > 0 && denominador < 0){
                r = numerador/denominador;
                System.out.println(String.format("%.1f",r));
            }else if(numerador < 0 && denominador == 0){
                System.out.println("DIVISÃO IMPOSSÍVEL");
            }else{
                r = numerador/denominador;
                System.out.println(r);
            }


        }
    }
}
