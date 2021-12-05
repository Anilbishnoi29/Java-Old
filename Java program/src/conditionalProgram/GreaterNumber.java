package conditionalProgram;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three number....");
		int a = 0, b = 0, c = 0;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.println("Checking Greater number....");
		if (a == b && b == c) {
			System.out.println("All numbers are Equal...");
		} else if (a > b) {
			if(a>c) {
				System.out.println("A is greater number "+a);
			}else {
				System.out.println("C is greater number "+c);
			}
		}else if(b>a) {
			if(b>c) {
				System.out.println("B is greater "+b);
			}else {
				System.out.println("C is greater number "+c);
			}
		}

	}

}
