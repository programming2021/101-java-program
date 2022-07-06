import java.util.Scanner;

public class MathClass {
	
	public MathClass() {
		displaySquare();
	}
	
	private double square(double x) {
		double s = x / 2;
		
		int k = 0;
		while (k <= 100) {
			s = (s + (x / s)) / 2;
			k++;
		}
		return s;
	}
	
	public void displaySquare() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a double number: ");
		double x = scanner.nextDouble();
		System.out.println("The square root of " + x + " = " + square(x));
	}
}
