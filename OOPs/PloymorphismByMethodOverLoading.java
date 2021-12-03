package demo;

public class PloymorphismByMethodOverLoading {

	// show method 1
	void show(int a) {
		System.out.println("One args =>" + a);
	}

	// show method 2
	void show(int a, int b) {
		System.out.println("Two args =>" + a + " , " + b);
	}

	public static void main(String[] args) {
		// objects
		PloymorphismByMethodOverLoading obj = new PloymorphismByMethodOverLoading();

		// show method 1
		obj.show(5);
		// show method 1 use char 'a' as an agrs output is 97  
		obj.show('a');

		// show method 2
		obj.show(1, 2);

	}

}
