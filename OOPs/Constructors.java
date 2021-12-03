package demo;

public class Constructors {

// instance variable(these variable for object)
	String emp_name = null;
	int emp_id = 0;

//	Constructor with parameter
	Constructors(String name, int id) {
		this.emp_name = name;
		this.emp_id = id;
	}
	
//	method for display values
	public void emp_display() {
		System.out.println(this.emp_id+" "+this.emp_name);
	}

	public static void main(String[] args) {
//	Object of Constructors 
		Constructors e1 = new Constructors("Mohit", 101);
		Constructors e2 = new Constructors("Rohit", 102);
		
//	display values by object
		e1.emp_display();
		e2.emp_display();

	}
}