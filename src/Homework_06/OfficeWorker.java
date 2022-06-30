package Homework_06;

public class OfficeWorker extends Employee {

	public OfficeWorker(String name, String surname) {
		super(name, surname);

	}

	public OfficeWorker(String name, String surname, double wage) {
		super(name, surname, wage);

	}

	public String defineTitle() {

		String title = getTitle();
		double wage = getWage();

		if (wage == 0 || wage < 8000) {
			setWage(8000);
			title = "Intern";
		} else if (wage > 8000 && wage < 12000) {

			title = "Employee";
		} else if (wage >= 12000) {

			title = "Senior Employee";
		}

		setJob("Employee");
		setTitle(title);
		return title;
	}

	public void getPromotion(int percentage) { // override method

		double newWage = getWage();
		setWage(newWage + (newWage * percentage / 100));
		defineTitle();

	}

}
