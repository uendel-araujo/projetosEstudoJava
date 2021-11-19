package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que terá sua altura cadastrada: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for( int i = 0; i < vect.length; i++) {
			System.out.print("Digite a altura da "+ (i+1) +" pessoa: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE HEIGHT: %.2f\n" , avg);
		
		sc.close();

	}

}
