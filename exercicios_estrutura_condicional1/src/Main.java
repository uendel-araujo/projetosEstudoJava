import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exerc�cio 1 - Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o. 
		 
		System.out.println("Digite um n�mero inteiro para saber se o mesmo � POSITIVO ou NEGATIVO");
		int x = sc.nextInt();
		if(x == 0) {
			System.out.println("O n�mero que voc� digitou � NEUTRO. Esse n�mero � o 0");
		} else if (x > 0) {
			System.out.println("O n�mero que voc� digitou � POSITIVO");
		} else {
			System.out.println("O n�mero que voc� digitou � NEGATIVO ");
		}
		*/

		/* EXERC�CIO 2 - Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar. 
		
		System.out.println("Digite um n�mero inteiro para saber se o mesmo � IMPAR ou PAR");
		int x = sc.nextInt();
		if ( x % 2 == 0 ) {
			System.out.println("O n�mero � PAR");
		} else {
			System.out.println("O n�mero � IMPAR");
		} **/
		
		/* EXERC�CIO 3 - Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
									  Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
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
