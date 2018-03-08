public class Employee extends Person {

	protected String employeeID;
	
	@Override
	protected void work() {
		System.out.println("I am working!");
		
	}
	
	public Employee() {
		this.employeeID = "0";
	}

	public Employee(String employeeID) {
		this.employeeID = employeeID;
	}
	
	public Employee(String name, String gender, String employeeID) {
		this.name = name;
		this.gender = gender;
		this.employeeID = employeeID;
	}
	

}
