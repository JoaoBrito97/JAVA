import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.print("NÚMERO: ");
        num = leia.nextInt();
        for (int i = 1;i<=num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }


}
