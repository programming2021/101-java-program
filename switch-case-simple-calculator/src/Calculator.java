import java.util.Scanner;

public class Calculator {
	
	public Calculator() {
		displayCalculator();
	}
	
	@SuppressWarnings("unused")
	private void calcuator(double a, double b, char c) {
		String result = "";
		double total = 0;
		
		switch (c) {
		case '+': {
			total = a + b;
			System.out.printf("%.2f %c %.2f = %.2f \n", a, c, b, total);
			break;
		}
		case '*': {
			total = a * b;
			System.out.printf("%.2f %c %.2f = %.2f \n", a, c, b, total);
			break;
		}
		case '-': {
			total = a - b;
			System.out.printf("%.2f %c %.2f = %.2f \n", a, c, b, total);
			break;
		}
		case '/': {
			if(b == 0) {
				System.out.println("ERROR! Division by zero");
				return;
			}
			else {
				total = a / b;
				System.out.printf("%.2f %c %.2f = %.2f \n", a, c, b, total);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + c);
		}	
	}
	
	private void displayCalculator() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			double num2 = scanner.nextDouble();
			System.out.println("Enter an operation:(+ , - , * , /) ");
			char op = scanner.next().charAt(0);
			
			calcuator(num1, num2, op);
		}
	}

}
