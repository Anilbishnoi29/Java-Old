package demo;

public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Bike b = new Bike();
		
		c.start();
		b.start();
	}

}

// car class
class Car extends Vehicle{
	int numOfTyers = 4;
	void start() {
		System.out.println("Car Start with key...");
	}
}

//car class
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike Start with kick...");
	}
}

// abstract main class 
abstract class Vehicle{
	int numOfTyers;
	abstract void start();
}