import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the max value (<= 95): ");
		int max = scanner.nextInt();
		
		if(max > 95)
			System.out.println("The number is too large! Choose a number less than 95.");
		else {
			System.out.println(max + " first elements of the fibonacci series.");
			System.out.println("===================");
			generate_fibonacci(max);
		}	
	}
	
	
	private static void generate_fibonacci(int max) {
		long[] fib = new long[max];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for (int k = 2; k < fib.length; k++) {
			fib[k] = fib[k-1] + fib[k-2];
		}
		
		for (long l : fib) {
			System.out.println("\t" + l);
		}
	}

}
