package demo;

public class Encapulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.setEmpId(110);
		int a = em.getEmpId();
		System.out.println(a);
		
	}

}

class Employee{
	private int empId;
	
//	setter method
	public void setEmpId(int eId) {
		empId = eId;
	}
	
//	getter method
	public int getEmpId() {
		return empId;
	}
}
