package demo;

//Class InheritanceTypes extends class b properties and also class a's child class or sub class
public class InheritanceTypes extends b {
	public static void main(String[] args) {
		// object
		InheritanceTypes inhert = new InheritanceTypes();

		// Class a's method called by   object
		inhert.show();
		// Class b's method called by InheritanceTypes object
		inhert.display();
	}
}

// Class A  parent class or super class
class a1 {
	public void show() {
		System.out.println("Class A show method");
	}
}

// Class B extends class a properties child class or sub class
class b extends a1 {
	public void display() {
		System.out.println("Class B Display method");
	}
}