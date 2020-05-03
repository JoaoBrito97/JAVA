import java.util.Scanner;
import java.util.Locale;
public class Exe05
{
	public static void main(String[] args) {
		int codp, qtd,codp1, qtd1,c1 = 0,c2 = 0;
		double valor,valor1,resultado;
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("CÓD: ");
		codp = leia.nextInt();
		System.out.print("QUANTIDADE: ");
		qtd = leia.nextInt();
		System.out.print("VALOR ");
		valor = leia.nextDouble();
		System.out.print("CÓD: ");
		codp1 = leia.nextInt();
		System.out.print("QUANTIDADE: ");
		qtd1 = leia.nextInt();
		System.out.print("VALOR ");
		valor1 = leia.nextDouble();
		if(qtd > 0 && qtd1 > 0){
		   resultado = qtd * valor + qtd1 * valor1;
		   System.out.println("VALOR TOTAL A PAGAR R$"+String.format("%.2f",resultado));
		}else{
		    resultado = valor + valor1;
		    System.out.println("VALOR TOTAL A PAGAR R$"+String.format("%.2f",resultado));
		}
	
	

	}
}