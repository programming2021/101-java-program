import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an integer (n >= 0):");
			int n = input.nextInt();
			
			System.out.println(n + "! = " + nFactorial(n));
			
			System.out.println("Enter a & n to find a to power of n:");
			int a = input.nextInt();
			int n2 = input.nextInt();
			System.out.println(a+ " ^ " + n2 + " = " + aToPower_n(a, n2));
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static long nFactorial(int n) {
	
		if(n < 1)
			return 1;
		else
			return n * nFactorial(n-1);
	}
	
	@SuppressWarnings("null")
	private static long aToPower_n(int a, int n) {
		 
		if(n < 0)
			return (Long) null;
		if(n == 0)
			return 1;
		else
			return a * aToPower_n(a, n-1);
	}
}
