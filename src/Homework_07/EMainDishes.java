package Homework_07;

import java.util.Random;

public enum EMainDishes implements IGeneral {

	GrillChicken(1), SpaghettiCarbonara(2), MeatballsWithPatatos(3), Kebab(4), Beaf(5), Hamburger(6), Pizza(7),
	MixedInSalate(8), Sushi(9), Falafel(10);

	int number;

	private EMainDishes(int number) {

		this.number = number;
	}

	@Override
	public EMainDishes pickRandom() {

		Random random = new Random();
		EMainDishes[] values = EMainDishes.values();
		int lenght = values.length;

		int pick = random.nextInt(lenght);

		return values[pick];
	}

}
