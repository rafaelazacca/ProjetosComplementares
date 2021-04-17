import java.util.Scanner;

public class FuncoesMatematicas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x;
		double y;
		double z;
		double A, B, C;
		
		System.out.println("Digite o valor de x");
			
		x = sc.nextDouble();
		
		System.out.println("Digite o valor de y");
		
		y = sc.nextDouble();
		
		System.out.println("Digite o valor de z");
		
		z = sc.nextDouble();
	
	
	
	A = Math.sqrt(x);
	B = Math.sqrt(y);
	C = Math.sqrt(25.0);
	
	System.out.printf("Raiz quadrada de %.2f é %.2f\n", x, A);
	System.out.printf("Raiz quadrada de %.2f é %.2f\n", y, B);
	System.out.printf("Raiz quadrada de 25 é %.2f\n", C);
	
	
	A = Math.pow(x, y);
	B = Math.pow(x, 2.0);
	C = Math.pow(5.0, 2.0);
	System.out.println(x + " elevado a " + y + " = " + A);
	System.out.println(x + " elevado ao quadrado = " + B);
	System.out.println("5 elevado ao quadrado = " + C);
	
	A = Math.abs(y);
	B = Math.abs(z);
	System.out.println("Valor absoluto de " + y + " = " + A);
	System.out.println("Valor absoluto de " + z + " = " + B);
	
	
	sc.close();
		
	
	
	
	}

}
