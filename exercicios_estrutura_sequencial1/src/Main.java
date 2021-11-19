import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercicio 1 - Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma 
			mensagem explicativa 
		System.out.println("Digite o primeiro valor: ");
		int x = sc.nextInt() ;
		System.out.println("Digite o ssegundo valor: ");
		int y = sc.nextInt();
		int soma = x + y;
		System.out.printf("O valor da soma dos dois n�mero �: %d%n", soma);
		System.out.println(); */
		
		/* Exercicio 2 - Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
			casas decimais conforme exemplos. F�rmula da �rea: area = PI * raio2. Considere o valor de PI = 3.14159 
		System.out.print("Digite o valor do raio: ");
		double valorRaio = sc.nextDouble();
		double pi = 3.14159;
		double areaCirculo = pi * Math.pow(valorRaio, 2);
		System.out.println();
		System.out.printf("O valor da �rea do circulo �: %.4f%n", areaCirculo);
		System.out.println(); **/

		/* Exerc�cio 3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto 
			de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D). 
		System.out.println("Digite os valores de A, B , C e D para descobrir a DIFEREN�A do PRODUTO entre eles.");
		System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int C = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int D = sc.nextInt();
		int diferencaProduto = A * B - C * D;
		System.out.println("O valor da Diferen�a do Produtos �: " + diferencaProduto); **/
		
		/* Exerc�cio 4 -  Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
			hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
			decimais. 
		
		System.out.println("Informe o nome do funcion�rio: ");
		String nomeFuncionario = sc.nextLine();
		System.out.println("Informe agora o n�mero de cadastro do funcion�rio: ");
		int numFuncionario = sc.nextInt();
		System.out.println("Informe a quantidade de horas trabalhada por esse funcion�rio: ");
		float horasTrabalhada = sc.nextFloat();
		System.out.println("Informe o valor da hora desse funcion�rio: ");
		float salarioHora = sc.nextFloat();
		
		float salarioFinal = horasTrabalhada * salarioHora;
		
		System.out.printf(" Nome do Funcion�rio: %s%n Num�ro de cadastro: %d%n Horas trabalhada no m�s: %.2f%n "
									+ "Valor ganho por hora: %.2f%n Sal�rio do m�s: %.2f%n", nomeFuncionario, numFuncionario, horasTrabalhada,
									salarioHora, salarioFinal); **/
		
		/* Exerc�cio 5 - Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
			c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.  
		
		int codigoItem1, qtdItem1, codigoItem2, qtdItem2;
		double valorItem1, valorItem2, somaValorItem1, somaValorItem2, somaValorFinal;
		System.out.println("Informe o c�digo da primeira pe�a:");
		codigoItem1 = sc.nextInt();
		System.out.println("Informe a quantidade de pe�as: ");
		qtdItem1 = sc.nextInt();
		System.out.println("Informe o valor unit�rio da pe�a para que o calculo final seja realizado: ");
		valorItem1 = sc.nextDouble();
		System.out.printf(" C�digo da pe�a: %d\n Quantidade de pe�as: %d\n Valor unit�rio da pe�a: %.2f\n", codigoItem1, qtdItem1, valorItem1);
		somaValorItem1 = valorItem1 * qtdItem1;
		System.out.printf("Valor total das pe�as de codigo: %d � de R$ %.2f\n", codigoItem1, somaValorItem1);
		
		System.out.println();
		
		System.out.println("Informe o c�digo da segunda pe�a:");
		codigoItem2 = sc.nextInt();
		System.out.println("Informe a quantidade de pe�as: ");
		qtdItem2 = sc.nextInt();
		System.out.println("Informe o valor unit�rio da pe�a para que o calculo final seja realizado: ");
		valorItem2 = sc.nextDouble();
		System.out.printf(" C�digo da pe�a: %d\n Quantidade de pe�as: %d\n Valor unit�rio da pe�a: %.2f\n", codigoItem2, qtdItem2, valorItem2);
		somaValorItem2 = valorItem2 * qtdItem2;
		System.out.printf("Valor total das pe�as de codigo: %d � de R$ %.2f\n", codigoItem2, somaValorItem2);
		
		System.out.println();
		
		somaValorFinal = somaValorItem1 + somaValorItem2;
		System.out.printf("O valor total da compra � de R$ %.2f\n", somaValorFinal);		**/
		
		
		sc.close();
	}

}