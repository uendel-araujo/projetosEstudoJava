import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		char g;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		g = sc.next().charAt(0);
		
		System.out.println("Voc� digitou: " + x);
		System.out.println("O n�mero digitado foi: " +y);
		System.out.println("O n�mero decimal �: " +z);
		System.out.println("O seu g�nero �: " +g);
		
		sc.close();
	}

}
