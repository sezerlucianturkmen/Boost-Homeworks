package Homework_07;

public class MenuManager {

	public static void main(String[] args) {

		for (EWeekDays days : EWeekDays.values()) {
			Menu menu = new Menu(days);
		}
	}

}
