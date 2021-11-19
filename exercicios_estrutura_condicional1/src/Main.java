import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercício 1 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
		 
		System.out.println("Digite um número inteiro para saber se o mesmo é POSITIVO ou NEGATIVO");
		int x = sc.nextInt();
		if(x == 0) {
			System.out.println("O número que você digitou é NEUTRO. Esse número é o 0");
		} else if (x > 0) {
			System.out.println("O número que você digitou é POSITIVO");
		} else {
			System.out.println("O número que você digitou é NEGATIVO ");
		}
		*/

		/* EXERCÍCIO 2 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
		
		System.out.println("Digite um número inteiro para saber se o mesmo é IMPAR ou PAR");
		int x = sc.nextInt();
		if ( x % 2 == 0 ) {
			System.out.println("O número é PAR");
		} else {
			System.out.println("O número é IMPAR");
		} **/
		
		/* EXERCÍCIO 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
									  Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
									  ordem crescente ou decrescente. 
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		} **/
		
	}

}
