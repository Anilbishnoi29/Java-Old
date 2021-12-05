package Patterns;

public class StarPattern1 {

	public static void main(String[] args) {
		int i, j,k;
//		1,
		for(i=1;i<=5;i++) {
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		2,
		for(i=1;i<=5;i++) {
			for(k=2;k<=i;k++) {
				System.out.print(" ");
			}
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
