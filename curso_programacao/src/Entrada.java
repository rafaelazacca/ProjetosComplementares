import java.util.Locale;
import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x;
		System.out.println("Digite um n�mero");
		x = sc.nextDouble();
		
		System.out.println("O n�mero �: " + x);
		sc.close();
	}
		
	

}
