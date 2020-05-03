import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class Exe02
{
	public static void main(String[] args) {
		double raio, area;
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("RAIO ");
		raio = leia.nextDouble();
		area = Math.pow(raio, 2)*Math.PI;
		System.out.println("AREA = "+String.format("%.4f",area));

	}
}
