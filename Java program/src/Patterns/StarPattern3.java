package Patterns;

public class StarPattern3 {

	public static void main(String[] args) {
//		int i, j, k;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}
			}
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			for (int j = 4; j >= 1; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}

		for (int i = 3; i >= 1; i--) {
			System.out.println("    *       *       *");
		}

	}
}
