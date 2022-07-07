import java.util.Scanner;

public class MathClass {
	
	public MathClass() {
		 displayRoots();
	}
	
	private String findRoots(double a,double b,double c) {
		double delta = b * b - 4 * a * c;
		double root1, root2;
		String result = "The root(s) are: \n";
		
		if (delta > 0) {
			root1 = ((-b) + Math.sqrt(delta))/ (2 * a);
			root2 = ((-b) - Math.sqrt(delta))/ (2 * a);
			result += "root1: " + root1 + "\n" + "root2: " + root2 + "\n";
		}
		else if(delta == 0) {
			root1 = root2 = -b / (2 * a);
			result += "root1 = root2: " + root1 + "\n";
		}
		else {
			String r1, r2;
			double re = (-b)/ (2 * a);
			double im = Math.sqrt(-delta)/ (2 * a);
			if(re == 0) {
				r1 =  " i* " + im;
				r2 = " -i* " + im;
			}
			else {
				r1 = re + " + i* " + im;
				r2 = re + " - i* " + im;
			}
			result += "root1: " + r1 + "\n" + "root2: " + r2 + "\n";
			
		}
		return result;	
	}
	
	private void displayRoots() {
		try (Scanner scanner = new Scanner(System.in)) {
			double a, b, c;
			System.out.println("Please enter the coeficients of the function (a, b, c)");
			System.out.println("a: ");
			a = scanner.nextDouble();
			System.out.println("b: ");
			b = scanner.nextDouble();
			System.out.println("c: ");
			c = scanner.nextDouble();
			System.out.println(findRoots(a, b, c));
		}
		
	}
}
