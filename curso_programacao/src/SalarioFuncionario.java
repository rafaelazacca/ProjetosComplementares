import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
	int numero, horas; 
	double salario, valorHora;
	
	numero = sc.nextInt();
	
	horas = sc.nextInt();
	
	valorHora = sc.nextDouble();
	
	salario = valorHora * horas;
	
	System.out.println("Numero = " + numero);
	System.out.printf("Salario = %.2f", salario);			
	
	sc.close();
	
	
	
	
	
	}
	
	
}