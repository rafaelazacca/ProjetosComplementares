package br.com.generation.lacocondicional;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite a opera��o: ");
		operacao = leia.next().charAt(0);
		
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextDouble();
		
		if (operacao == '+')
		{
			resultado = numero1 + numero2;
		}
		else if (operacao == '-') 
		{
			resultado = numero1 - numero2;
		}
		else if (operacao == '*') 
		{
			resultado = numero1 * numero2;
		}
		else if (operacao == '/') 
		{
			resultado = numero1 / numero2;
		}
		 System.out.println("Resultado: " + resultado);
	
		 leia.close();
	}
}
