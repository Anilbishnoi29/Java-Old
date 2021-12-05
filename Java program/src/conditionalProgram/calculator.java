package conditionalProgram;

import java.util.Scanner;

public class calculator {

//	addInt method
	public static void addInt(char c, int x, int y) {
		switch(c) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '/':
			System.out.println(x/y);
			break;
		default:System.out.println("invalid operation....");
		}
	}
	
//addfloat method
	public static void addInt(char c, float x, float y) {
		switch(c) {
		case '+':
			System.out.println(x+y);
			break;
		case '-':
			System.out.println(x-y);
			break;
		case '*':
			System.out.println(x*y);
			break;
		case '/':
			System.out.println(x/y);
			break;
		default:System.out.println("invalid operation....");
		}
	}

//	main 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
//		VAR
		char c;
		float a=0,b=0;
		String yn;
		
		do {
//			get input
			System.out.println("Enter number for Calculate...");
			a = s.nextFloat();
			b = s.nextFloat();
			System.out.println("Enter opertaion for Calculate...");
			c = s.next().charAt(0);
			
			addInt(c,a,b);
			System.out.println("Do you want to continue (Press y for yes and n for No)");
			yn = s.next();
		}while(yn.equals("y") || yn.equals("Y"));
	}

}
