import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int num,fat=1;
        System.out.print("N!: ");
        num = leia.nextInt();
        for(int i = 1; i<=num; i++){
            fat*=i;
        }
        System.out.print(num+"! = "+fat);
    }
}
