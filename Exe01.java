import java.util.Scanner;
public class Exe01
{
	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner leia = new Scanner(System.in);
		System.out.print("NUMERO: ");
		num1 = leia.nextInt();
		System.out.print("NUMERO: ");
		num2 = leia.nextInt();
		soma = num1 + num2;
		System.out.print("SOMA = "+soma);
		
	}
}
