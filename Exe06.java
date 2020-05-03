import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class Exe06
{
	public static void main(String[] args) {
		double a,b,c,ac,at,ar,aq,atr;
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("A: ");
		a = leia.nextInt();
		System.out.print("B: ");
		b = leia.nextInt();
		System.out.print("C: ");
		c = leia.nextDouble();
		ac = Math.pow(c, 2)*Math.PI;
		ar = a * b;
		at = (a + b) * c / 2;
	    aq = Math.pow(b,2);
	    atr = a * c / 2;
	    System.out.println("TRIÂNGULO: "+String.format("%.3f",atr));
		System.out.println("CICULO: "+String.format("%.3f",ac));
		System.out.println("TRAPÉZIO: "+String.format("%.3f",at));
		System.out.println("QUADRADO: "+String.format("%.3f",aq));
		System.out.println("RETÂNGULO: "+String.format("%.3f",ar));

	
	

	}
}
