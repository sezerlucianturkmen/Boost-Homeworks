package Homework_06;

public class Employee {

	public static void main(String[] args) {

		Enginner enginner01 = new Enginner("John", "Black", 1000);
		enginner01.defineTitle();
		System.out.println("Salary of " + enginner01.getName() + " " + enginner01.getSurname() + " "
				+ enginner01.getWage() + " TL");
		System.out.println(enginner01.toString());

		System.out.println("-------------------------------------------------------------------------------------");

		Enginner enginner02 = new Enginner("Bella", "Swan", 14500);
		enginner02.defineTitle();
		System.out.println("Salary of " + enginner02.getName() + " " + enginner02.getSurname() + " "
				+ enginner02.getWage() + " TL");
		System.out.println(enginner02.toString());

		System.out.println("-------------------------------------------------------------------------------------");

		OfficeWorker officeWorker01 = new OfficeWorker("Michele", "Felice", 9000);
		officeWorker01.defineTitle();
		System.out.println("Salary of " + officeWorker01.getName() + " " + officeWorker01.getSurname() + " "
				+ officeWorker01.getWage() + " TL");
		System.out.println(officeWorker01.toString());

		// PROMOTION APPLIED
		System.out.println("-------------------------------------------------------------------------------------");

		enginner02.getPromotion(30);
		System.out.println("Salary of " + enginner02.getName() + " " + enginner02.getSurname() + " "
				+ enginner02.getWage() + " TL");
		System.out.println(enginner02.toString());

	} // main ends

	private String name;
	private String surname;
	private String job;
	private String title;
	private double wage;

	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Employee(String name, String surname, double wage) {
		super();
		this.name = name;
		this.surname = surname;
		this.wage = wage;
	}

	public void getPromotion(int percentage) {

		wage = wage + (wage * percentage / 100);

	}

	// POJO

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", job=" + job + ", title=" + title + ", wage="
				+ wage + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

}
