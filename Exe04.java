import java.util.Scanner;
import java.util.Locale;
public class Exe04{
	public static void main(String[] args) {
		int num;
		double sal, hora,resultado;
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("NÚMERO ");
		num = leia.nextInt();
		System.out.print("SALÁRIO: ");
		sal = leia.nextDouble();
		System.out.print("HORAS ");
		hora = leia.nextDouble();
		resultado = hora * sal;
		System.out.println("NUMEBER = "+num+"\nSALARY U$ "+String.format("%.2f",resultado));
	

	}
}
