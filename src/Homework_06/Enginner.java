package Homework_06;

public class Enginner extends Employee {

	public Enginner(String name, String surname) {
		super(name, surname);

	}

	public Enginner(String name, String surname, double wage) {
		super(name, surname, wage);

	}

	public String defineTitle() {

		String title = getTitle();
		double wage = getWage();

		if (wage == 0 || wage < 10000) {
			setWage(10000);
			title = "Intern Enginner";
		} else if (wage > 10000 && wage < 17000) {

			title = "Senior Enginner";
		} else if (wage >= 17000) {

			title = "Expert Enginner";
		}

		setJob("Engineer");
		setTitle(title);

		return title;
	}

	public void getPromotion(int percentage) { // override method

		double newWage = getWage();
		setWage(newWage + (newWage * percentage / 100) + 250);
		defineTitle();

	}

}
