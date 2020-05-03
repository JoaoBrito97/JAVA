import java.util.Scanner;
public class Exe15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("SENHA: ");
            num = leia.nextInt();
            if (num == 20121997) {
                System.out.println("ACESSO PERMITIDO");
                break;
            }else{
                System.out.println("SENHA INVÁLIDA");
            }
        }




    }

}
