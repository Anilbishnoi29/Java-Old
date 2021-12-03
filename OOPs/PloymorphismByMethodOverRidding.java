package demo;

public class PloymorphismByMethodOverRidding extends Test {

	String show() {
		System.out.println("PloymorphismByMethodOverRidding Class");
		return null;
	}

	public static void main(String[] args) {
		
		// Test class object
		Test t = new Test();
		t.show();
		
		// Test class object
		PloymorphismByMethodOverRidding p = new PloymorphismByMethodOverRidding();
		p.show();

	}

}

class Test {
	Object show() {
		System.out.println("Test Class");
		return null;
	}
}