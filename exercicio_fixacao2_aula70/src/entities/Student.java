package entities;
import java.util.Scanner;

public class Student {

	Scanner scanner = new Scanner(System.in);
	
	public String name;
	public double note1, note2, note3;
	
	public double finalGrade( ) {
		
		double media = note1 + note2 + note3;
		if(media > 60 ) {
			System.out.println("Final Grade = " + media);
			System.out.println("Pass");
		} else {
			System.out.println("Final Grade = " + media);
			System.out.println("Failed");
			double missingPoint = 60 - media;
			System.out.println("Missing "+ missingPoint + " Points");
		}
		
		return media;
	}
	
	public String toString() {
		return  " " + finalGrade();
		
	}
	
}
