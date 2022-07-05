package Homework_07;

import java.util.Random;

public enum ESoups implements IGeneral {

	LentilSoup(1), PumpkinSoup(2), YogurtSoup(3), ColdSoup(4), TarhanaSoup(5);

	int number;

	ESoups(int number) {
		this.number = number;
	}

	@Override
	public ESoups pickRandom() {

		Random random = new Random();
		ESoups[] values = ESoups.values();
		int lenght = values.length;

		int pick = random.nextInt(lenght);

		return values[pick];
	}

}
