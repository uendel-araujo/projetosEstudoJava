package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;
//import entities.Employee;
//import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		System.out.println("Student Name: ");
		student.name = sc.nextLine();
		System.out.println("Note First Unit");
		student.note1 = sc.nextDouble();
		System.out.println("Note Second Unit");
		student.note2 = sc.nextDouble();
		System.out.println("Note Third Unit");
		student.note3 = sc.nextDouble();
		
		student.toString();
		
		/*Employee emp = new Employee();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ emp);
		System.out.println();
		System.out.println("Wich percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);*/
		
		
		
		/*Rectangle rectangle = new Rectangle();
		System.out.print("Informe o valor da LARGURA ( base ): ");
		rectangle.width = sc.nextDouble();
		System.out.println();
		System.out.print("Informe agora o valor da ALTURA: ");
		rectangle.height = sc.nextDouble();
		System.out.println();
		
		System.out.printf("�REA = %.2f\n", rectangle.area());
		System.out.printf("�REA = %.2f\n", rectangle.perimeter());
		System.out.printf("�REA = %.2f\n", rectangle.diagonal());*/
		
		sc.close();

	}

}
