package conditionalProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a = 0;
		int fact = 1;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for fact...");
		a = s.nextInt();
		
		for(int i = 1;i<=a; i++) {
			fact = fact*i;
		}
		
		
		System.out.println(fact);

	}

}
