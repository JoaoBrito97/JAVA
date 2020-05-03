import java.util.Scanner;
public class Exe03
{
	public static void main(String[] args) {
		int a,b,c,d, resultado;
		Scanner leia = new Scanner(System.in);
		System.out.print("VALOR DE A: ");
		a = leia.nextInt();
		System.out.print("VALOR DE B: ");
		b = leia.nextInt();
		System.out.print("VALOR DE C: ");
		c = leia.nextInt();
		System.out.print("VALOR DE D: ");
		d = leia.nextInt();
		resultado = a * b - c * d;
		System.out.println("DIFERENÇA = "+resultado);
	

	}
}
