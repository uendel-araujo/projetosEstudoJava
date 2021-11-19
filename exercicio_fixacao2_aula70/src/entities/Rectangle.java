package entities;

public class Rectangle {

	public double width, height;
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return 2 * (this.width + this.height);
	}
	
	public double diagonal() {
		return  Math.sqrt(Math.pow(width, 2.00) + Math.pow(height, 2.00));
		
	}
}
