package conditionalProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// LeapYear
		int year = 0;
		System.out.println("Enter a year...");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		year = s.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It's a leap year");
		}else {
			System.out.println("Not a leap year");
		}

	}

}
