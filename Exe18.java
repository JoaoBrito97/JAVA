import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("DIGITE UM NÚMERO: ");
        num = leia.nextInt();
        for(int i = 1; i <= num; i+=2){
            System.out.println(i);
        }
    }
}
