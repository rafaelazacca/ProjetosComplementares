import java.util.Scanner;

public class ExercicioSoma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valor1, valor2, soma;
		
		System.out.println("Digite primeiro valor");
		
		valor1 = sc.nextInt();
		
		System.out.println("Digite segundo valor");
		
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2; 
				
		System.out.printf("A soma dos valores %d e %d é %d", valor1, valor2, soma);
		
		
		
		
		
		sc.close();
		
	}

}
