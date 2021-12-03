package demo;

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tests test = new Tests();
		test.setVal(10);
		test.getVal();
	}

}

class Tests{
	int num;
	
	void setVal(int num) {
		this.num = num;
	}
	
	void getVal() {
		System.out.println(num);
	}
}