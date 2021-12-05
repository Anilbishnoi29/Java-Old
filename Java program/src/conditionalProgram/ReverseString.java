package conditionalProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String str, reverseStr = "";
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		int StringLength = str.length();

		for (int i = (StringLength - 1); i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		System.out.println(reverseStr);
	}
}
