package demo;

public class MyDemo {

//	reference variable 
	String color = "";
	int age = 0;

//	Constructors (it's call it self when object is created
	public MyDemo() {
		System.out.println("Constructors...");
	}
	
//	initialization of object 
	public void intiObj(String c, int a) {
		color = c;
		age = a;
	}
//	display of initialization object 
	public void display() {
		System.out.println("Buzo color = " + color);
		System.out.println("Buzo age = " + age);
	}

//	Method 
	public void eat() {
		System.out.println("Happy Eating.... ;)");
	}

	public void run() {
		System.out.println("Happy Running.... ;)");
	}

//	Main method
	public static void main(String[] args) {
//	creating object
		MyDemo buzo = new MyDemo();
		Birds b = new Birds();

//		calling method by object
//		buzo.color = "Black";
//		buzo.age = 2;
		buzo.intiObj("Blcak", 2);

		buzo.eat();
		buzo.run();
		buzo.display();
		
		b.fly();
	}
}
// another class
class Birds {
//	method
	void fly() {
		System.out.println("Happy Flying.... ;)");
	}
}