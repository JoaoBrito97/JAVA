import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao,a = 0,g = 0,d = 0;
        while (true){
            System.out.println("1 - ALCOOL \n2 - GASOLINA \n3 - DIESEL \n4 - FIM");
            opcao = leia.nextInt();
            if(opcao == 1){
                a+=1;
            }else if(opcao == 2){
                g+=1;
            }else if(opcao == 3){
                d+=1;
            }else if(opcao == 4){
                break;
            }

        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("ALCOOL: "+a);
        System.out.println("GASOLINA: "+g);
        System.out.println("DIESEL: "+d);

    }
}
