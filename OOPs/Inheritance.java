package demo;

// Child Class or Sub Class
public class Inheritance extends Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance inhert = new Inheritance();
		
		inhert.eat();
	}
 
}

// Parent Class or Super Class
class Dog{
	public void eat() {
		System.out.println("Dog Eating");
	}
}