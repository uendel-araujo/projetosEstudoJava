import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Criação dos produtos
		String product1 = "Computer";
		String produtc2 = "Office desk";
		
		//Criação do vendedor(a)
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		//Criação dos preços e médias
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n %s, which price is $ %.2f%n %s, which price is $ %.2f%n", product1, price1, produtc2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%nRouded (three decimal places): %.3f%n",measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}
