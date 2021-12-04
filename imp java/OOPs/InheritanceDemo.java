package demo;

public class InheritanceDemo extends A {
	public static void main(String[] args) {

		InheritanceDemo ID = new InheritanceDemo();
		ID.x();

	} 
}

class A {
	private int a = 10;
    
	public void x() {
		System.out.println(a);
	}
}