package Homework_07;

import java.util.Random;

public enum EBeverage implements IGeneral {

	CocaCola(1), Vine(2), FruitJuice(3), NaturalWater(4), SparklingWater(5);

	int number;

	EBeverage(int number) {
		this.number = number;
	}

	@Override
	public EBeverage pickRandom() {

		Random random = new Random();
		EBeverage[] values = EBeverage.values();
		int lenght = values.length;

		int pick = random.nextInt(lenght);

		return values[pick];
	}

}
