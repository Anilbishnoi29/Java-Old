package conditionalProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");
		int a = 0;
		a = s.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
