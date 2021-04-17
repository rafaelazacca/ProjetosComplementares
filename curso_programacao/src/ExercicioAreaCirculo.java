
public class ExercicioAreaCirculo {
	public static void main(String[] args) {
		
		double raio = 2.00;
		double pi = 3.14159;
		double A;
		double area;
		
		
		A = Math.pow(raio, 2);
		area = pi * A;
		
		
		System.out.printf("O valor da área de %.2f é %.4f", raio, area);
		
	}

}
