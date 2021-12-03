package demo;


class ConO {
	private int x = 0;
	private int y = 0;

//	no agrgument
	
	ConO(){
		this.x=this.y=0;
	}

// one agrgument
	
	ConO(int n){
		this.x=this.y=n;
	}
//two agrument
	
	ConO(int x1, int y1){
		this.x=x1;
		this.y=y1;
	}

	void display() {
		System.out.println(x + " , " + y);
	}

}

public class ConstructorsOverloading {
	public static void main(String[] args) {
		ConO c1 = new ConO();
		c1.display();
		
		ConO c2 = new ConO(5);
		c2.display();
		
		ConO c3 = new ConO(8,7);
		c3.display();

	}
}
