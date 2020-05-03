import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double num;
        System.out.print("DIGITE UM NÚMERO: ");
        num = leia.nextDouble();
        if(num >= 0 && num <= 25 ){
            System.out.println("INTERVALO [0, 25]");
        }else if(num > 25 && num <= 50){
            System.out.println("INTERVALO [25, 50]");
        }else if(num >= 75 && num <=100){
            System.out.println("INTERVALO [75, 100]");
        }else{
            System.out.println("FORA DO INTERVALO");
        }
    }
}
