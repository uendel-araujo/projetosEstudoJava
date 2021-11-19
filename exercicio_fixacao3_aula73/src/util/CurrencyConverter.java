package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double amountReals(double priceDollar, double quantityDollar) {
		return priceDollar * quantityDollar + (priceDollar * quantityDollar * IOF) ;
	}
}
