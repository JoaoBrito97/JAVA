import java.util.Scanner;
public class Funcao {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a,b,c;
        System.out.println("VALOR DE A:");
        a = leia.nextInt();
        System.out.println("VALOR DE B:");
        b = leia.nextInt();
        System.out.println("VALOR DE C:");
        c = leia.nextInt();


        //função para realizar a logica
        int higher = max(a,b,c);

        //função para mostrar na tela o resultado.
        showResult(higher);

        leia.close();
    }

    //ñ precisa ser as variaveis a,b,c
    public static int max(int x, int y, int z){
        int aux;
        if(x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux= z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("MAIOR = "+value);
    }


}
