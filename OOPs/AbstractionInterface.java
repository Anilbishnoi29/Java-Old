package demo;

public class AbstractionInterface implements Absint {
//	main method
	public static void main(String[] args) {
		AbstractionInterface ai = new AbstractionInterface();
		ai.show(); 
	}

	@Override
	public void show() {
		System.out.println("interface");
	}

}

interface Absint {

// variables
	public static final int a = 10;
	
	
//	abstract method
	public void show();

//	default method

	default void display() {
		System.out.println("default void display()...");
	}

//	static method
	public static void run() {
		System.out.println("public static void run()...");
	}
}