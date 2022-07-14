import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("En n to calculate n!: ");
			int n = scanner.nextInt();
			 
			long start, stop;
			start = System.nanoTime();
			System.out.println(n + "! = " + nFactorial_recursive(n)); 
			stop = System.nanoTime();
			
			long elapse = stop - start;
			System.out.println("Elapse time for recursion method in milliseconds = " + elapse/1000);
			long start2, stop2;
			
			start2 = System.nanoTime();
			System.out.println(n + "! = " + nFactorial_iteration(n)); 
			stop2 = System.nanoTime();
			
			long elapse2 = stop2 - start2;
			System.out.println("Elapse time for iteration method in milliseconds = " + elapse2/1000);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	//recursion vs iteration
	
	private static double nFactorial_recursive(int n) {
		if(n <= 1)
			return 1;
		else {
			return n * nFactorial_recursive(n - 1);
		}	
	}
	
	private static double nFactorial_iteration(int n) {
		double result = 1;
		for (double k = 1; k <= n; k++) {
			result = result * k;
		}
		return result;
	}
}


