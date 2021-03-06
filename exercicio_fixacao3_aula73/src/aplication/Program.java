package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = sc.nextDouble();
		
		double amountReals = CurrencyConverter.amountReals(priceDollar, quantityDollar);
		System.out.printf("O valor a ser pago em reais ?: %.2f\n", amountReals);

		sc.close();
	}

}
