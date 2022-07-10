import java.util.Scanner;

public class MathClass {
	
	public MathClass() {
		displayPrimes();
	}
	
	private boolean isPrime(long n){
		boolean ok = true;
		
		if(n < 2) {
			ok = false;
		}else {
			for (long k = 2; k <= (n/2); k++) {
				if(n % k == 0) {
					ok = false;
				}
			}	
		}
		return ok;
	}
	
	private void displayPrimes() {
		long count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the maximum number: ");
		long max = scanner.nextLong();
		System.out.println("Prime numbers up to " + max + ":");
		System.out.println("============");
		for (long k = 0; k <= max; k++) {
			if(isPrime(k)) {
				count++;
				System.out.println(k);
			}
		}
		System.out.println("============");
		System.out.println("There are " + count + " prime numbers from 0 to " + max);
	}

}
