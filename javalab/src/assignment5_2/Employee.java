package assignment5_2;

public abstract class Employee {

	private String name, address;
	private int basicSalary, LOP, workingDays;
	
	
	public Employee(String name, String address, int basicSalary, int lOP, int workingDays) {
		super();
		this.name = name;
		this.address = address;
		this.setBasicSalary(basicSalary);
		setLOP(lOP);
		this.setWorkingDays(workingDays);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getLOP() {
		return LOP;
	}

	public void setLOP(int lOP) {
		LOP = lOP;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}
	
}
