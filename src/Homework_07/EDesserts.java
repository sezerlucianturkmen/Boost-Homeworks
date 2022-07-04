package Homework_07;

import java.util.Random;

public enum EDesserts implements IGeneral {

	Baklava(1), Tiramisu(2), Gelato(3), CheeseCake(4), Cookies(5);

	int number;

	EDesserts(int number) {
		this.number = number;
	}

	@Override
	public EDesserts pickRandom() {

		Random random = new Random();
		EDesserts[] values = EDesserts.values();
		int lenght = values.length;

		int pick = random.nextInt(lenght);

		return values[pick];
	}

}
