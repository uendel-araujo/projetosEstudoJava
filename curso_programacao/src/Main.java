import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f por mês %n", nome, idade, renda);
		
		double x = 10.599845478;
		System.out.printf("%.2f%n" ,x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n" ,x);
		

	}

}
