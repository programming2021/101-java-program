import java.util.Scanner;

public class MathClass {
	
	public MathClass() {
		// TODO Auto-generated constructor stub
		displayMultTble();
	}
	
	private void displayMultTble() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the max value: ");
			int n = scanner.nextInt();
			mult_table(n);
		}
	}
	
	private void mult_table(int n) {
		if(n > 20 || n <= 2) {
			System.out.println("max value must be between 3 to 20");
		}
		else {
			for (int k = 1; k <= n; k++) {
				for (int m = 1; m <= n; m++) {	
					System.out.print("\t" + k * m);
				}
				System.out.println();
			}
		}
	}

}
