import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a, b;
			System.out.println("Enter two numbers a & b:");
			a = scanner.nextInt();
			b = scanner.nextInt();
			swap(a, b);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static void swap(int a, int b) {
		System.out.println("Before:\t(a, b) = (" + a + "," + b + ")");
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After:\t(a, b) = (" + a + "," + b + ")");
		
	}

}
