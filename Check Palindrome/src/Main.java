import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a text to check if palindrome: ");
			String text = scan.next();
			check_palindrome_string(text);
			
			System.out.println("\n===========\n");
			
			System.out.println("Enter a number to check if palindrome: ");
			int num= scan.nextInt();
			check_palindrome_number(num);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static void check_palindrome_string(String text) {
		String reverse = "";
		int l = text.length();
		
		for (int k = l - 1; k >= 0; k--) {
			reverse += text.charAt(k);
		}
		System.out.println("The result: ");
		System.out.println("Original Text: " + text);
		System.out.println("Reverse  Text: " + reverse);
		if(text.equals(reverse)) {
			System.out.println(text + " is palindrome");
		}else {
			System.out.println(text + " is not palindrome");
		}
	}
	
	private static void check_palindrome_number(int num) {
		int reverse = 0;
		int temp = num;
		System.out.println("The result: ");
		System.out.println("The origina number = " + num);
		while (num != 0) {
			reverse = reverse  * 10 + (num % 10);
			num /= 10;	
		}
		System.out.println("The reverse number = " + reverse);
		
		if(temp == reverse) {
			System.out.println(temp + " is palindrome");
		}else {
			System.out.println(temp + " is not palindrome");
		}
	}

}
