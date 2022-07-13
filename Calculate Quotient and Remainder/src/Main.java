import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the first number: ");
			   int num1 = scanner.nextInt();
			   System.out.println("Enter the second number: ");
			   int num2 = scanner.nextInt();
			   
			   System.out.println(calculate_quotient_remainder(num1, num2));
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static String calculate_quotient_remainder(int num1, int num2) {
		double quotient = num1 / num2;
		double remainder = num1 % num2;
		String result = "The quotient of " + num1 + " and " + num2 + " =  " + quotient + "\n";
		result += "The remainder of " + num1 + " and " + num2 + " = " + remainder + "\n";
		return result;
	}

}
