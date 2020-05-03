import java.util.Scanner;
import java.lang.Math;

public class Exe24 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        double a = 0,a1 = 0, linha = 0;
        System.out.print("LINHAS: ");
        num = leia.nextInt();
        for (int i = 1 ; i <= num; i++){
             linha = Math.pow(i, 1);
             a = Math.pow(i, 2);
             a1 =Math.pow(i, 3);
             System.out.println((int)linha+" "+(int)a+" "+(int)a1);
        }

    }
}
