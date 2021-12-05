package conditionalProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		int remender = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for reverse...");
		num = scan.nextInt();

		while (num != 0) {
			remender = num % 10;
			result = result * 10 + remender;
			num = num/10;
		}
		
		System.out.println(result);

	}

}
