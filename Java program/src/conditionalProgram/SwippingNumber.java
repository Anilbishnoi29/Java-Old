package conditionalProgram;

public class SwippingNumber {

	public static void swip(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: "+x +"   " + y); 
	}
	
	public static void main(String[] args) {
		swip(5,6);
	}

}
