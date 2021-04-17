import java.util.Locale;

public class AulaEscrita {
	public static void main(String[] args) {
		
		double y = 25.79876655;
		double x = 26.45776;
		System.out.println(y);
		System.out.printf("%.2f\n", y);
		System.out.printf("o número é %.4f\n",y);
		System.out.println("Boa tarde!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", y);
		System.out.printf("RESULTADO = %.2f METROS\n", y);
		System.out.println("RESULTADO = " + y + " METROS");
		System.out.printf("primeiro valor = %.2f, segundo valor = %.2f\n", x, y);
		System.out.println("primeiro valor = " + y + " segundo valor =" + x);
	}
	

}
