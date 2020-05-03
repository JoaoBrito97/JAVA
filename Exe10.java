import java.util.Scanner;

public class Exe10 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int horai,horaf,resultado;
        System.out.print("HORA INICIAL: ");
        horai = leia.nextInt();
        System.out.print("HORA FINAL: ");
        horaf = leia.nextInt();
        if (horai > horaf){
            resultado = (24 - horai) + horaf;
            System.out.println("O JOGO DUROU "+resultado+"HS");
        }else if(horaf > horai){
            resultado = horaf - horai;
            System.out.println("O JOGO DUROU "+resultado+"HS");
        }else{
            System.out.println("O JOGO DUROU 24HS");
        }

    }


}
