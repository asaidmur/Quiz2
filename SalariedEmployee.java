
/*
 * Ardasher Saidmuradov
 * 300286501
 * CSIS 1275
 * Quiz 2
 * 
 */

public class SalariedEmployee extends Employee implements Promotable {

	protected String salary;
	
	public SalariedEmployee() {
		this.salary = "0";
	}
	
	public SalariedEmployee(String salary) {
		this.salary = salary;
	}

	public SalariedEmployee(String employeeID, String salary) {
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public SalariedEmployee(String name, String gender, String salary) {
		this.salary = salary;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public void comparePerformance() {
		System.out.println("comparing...");
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "salary = " + salary + "\n"
				+"employeeId = " + employeeID + "\n"
				+"name = " + name + "\n"
				+"gender = " + gender + "\n";
		
	}

	public static void main(String[] args) {
		SalariedEmployee emp = new SalariedEmployee("Jane", "Female", "45000.00");
		System.out.println(emp.toString());
		emp.comparePerformance();
		emp.work();
	
	}
	
	
}
