package Homework_05;

public class Market {

	Products[] products;

	private String name;
	private int employeeNumber;
	private int workingHourPerDay;

	public Market() {
		this.products = new Products[5];
	}

	public Market(Products[] products, String name, int employeeNumber, int workingHourPerDay) {
		super();
		this.products = products;
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.workingHourPerDay = workingHourPerDay;
	}

	// POJO

	public Products[] getProducts() {
		return products;
	}

	public void setProducts(Products[] products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getWorkingHourPerDay() {
		return workingHourPerDay;
	}

	public void setWorkingHourPerDay(int workingHourPerDay) {
		this.workingHourPerDay = workingHourPerDay;
	}

}
