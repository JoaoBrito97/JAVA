import java.util.Scanner;

public class Exe08 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("DIGITE UM NÚMERO: ");
        num = leia.nextInt();
        if (num % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("ÍMPAR");
        }
    }


}
