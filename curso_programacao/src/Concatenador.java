
public class Concatenador {
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s t�m %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		System.out.println(nome + " t�m " + idade + " anos e ganha R$ " + renda + " reais.");
	}
	
}
