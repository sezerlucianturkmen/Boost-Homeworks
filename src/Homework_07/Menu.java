package Homework_07;

public class Menu {

	EWeekDays day;

	public Menu(EWeekDays day) {
		super();
		this.day = day;
		System.out.println(day);
		System.out.println("--------------------------");
		setSoup();
		setDish();
		setBeverage();
		setDessert();
		System.out.println("-------Bon Appetite-------");

	}

	public void setSoup() {
		ESoups soup = ESoups.YogurtSoup;
		System.out.println("THE SOUP..: " + soup.pickRandom());
	}

	public void setDish() {
		EMainDishes dish = EMainDishes.Beaf;
		System.out.println("THE MAIN DISH..: " + dish.pickRandom());
	}

	public void setBeverage() {
		EBeverage beverage = EBeverage.CocaCola;
		System.out.println("THE BEVERAGE..: " + beverage.pickRandom());
	}

	public void setDessert() {
		EDesserts dessert = EDesserts.Baklava;
		System.out.println("THE DESSERT..: " + dessert.pickRandom());
	}
}
