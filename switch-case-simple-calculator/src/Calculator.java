import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		displayCalculator();
	}
	
	@SuppressWarnings("unused")
	private PrintStream calcuator(double a, double b, char c) {
		String result = "";
		double total = 0;
		
		switch (c) {
		case '+': {
			total = a + b;
			break;
		}
		case '*': {
			total = a * b;
			break;
		}
		case '-': {
			total = a - b;
			break;
		}
		case '/': {
			if(b == 0) {
				//throw new IllegalArgumentException("Argument 'divisor' is 0");
				System.out.printf("Division by zero! ");
				break;
			}else {
				total = a / b;
				break;
			}
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + c);
		}
		 
		return System.out.printf("%.2f %c %.2f = %.2f", a, c, b, total);
	}
	
	private void displayCalculator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();
		System.out.println("Enter an operation:(+ , - , * , /) ");
		char op = scanner.next().charAt(0);
		
		calcuator(num1, num2, op);
	}

}
