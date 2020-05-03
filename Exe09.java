import java.util.Scanner;
public class Exe09 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a, b;
        System.out.print("VALOR DE A: ");
        a = leia.nextInt();
        System.out.print("VALOR DE B: ");
        b = leia.nextInt();
        if(a % b == 0){
            System.out.println("SÃO MULTIPLOS");
        }
        else if(a < b && b % a == 0){
                System.out.println("SÃO MULTIPLOS");
        }
        else{
            System.out.println("NÃO SÃO MULTIPLOS");
        }
    }

}
