import java.util.Scanner;

public class Exe07 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("DIGITE UM NÚMERO: ");
        num = leia.nextInt();
        if (num >= 0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }


}
