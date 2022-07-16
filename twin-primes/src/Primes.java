import java.util.Scanner;


public class Primes {
	
	Scanner scanner = new Scanner(System.in);
	long max;
	
	public Primes() {
		System.out.println("Enter the outer limit (max number): ");
		max = scanner.nextLong();
		displayPrimes();
		displayTwinPrimes();
	}
	
	 
	
	private boolean isPrime(long n) {
		boolean ok = true;
		if(n <= 1)
			ok = false;
		else {
			for (int k = 2; k <= (n +1)/2; k++) {
				if(n % k == 0)
					return false;
			}
		}
		return ok;	
	}

	private void displayPrimes() {
		System.out.println("Prime numbers at intervall(0.."+ max + ")");
		System.out.println("    =============");
		long count = 0;
		for (int k = 0; k <= max; k++) {
			if(isPrime(k)) {
				System.out.println("\t" + k);
				count++;
				}
		}
		System.out.println("There are " + count + " prime numbers at intervall(0.."+ max + ")");
	}
	
	private void displayTwinPrimes() {
		System.out.println("\nTwinPrime numbers at intervall(0.."+ max + ")");
		System.out.println("    =============");
		long count = 0;
		for (int k = 0; k <= max; k++) {
			if(isPrime(k) && isPrime(k+2)) {
				System.out.println("\t(" + k + "," + (k+2) +")");
				count++;
				}
		}
		
		System.out.println("There are " + count + " twin prime numbers at intervall(0.."+ max + ")");
	}
}
