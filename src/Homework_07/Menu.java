package Homework_07;

public class Menu {

	EWeekDays day;
	ESoups soup = ESoups.YogurtSoup;
	EMainDishes dish = EMainDishes.Beaf;
	EBeverage beverage = EBeverage.CocaCola;
	EDesserts dessert = EDesserts.Baklava;

	public Menu(EWeekDays day) {
		super();
		this.day = day;
		System.out.println(day);
		System.out.println("--------------------------");
		System.out.println("THE SOUP..: " + soup.pickRandom());
		System.out.println("THE MAIN DISH..: " + dish.pickRandom());
		System.out.println("THE BEVERAGE..: " + beverage.pickRandom());
		System.out.println("THE DESSERT..: " + dessert.pickRandom());
		System.out.println("-------Bon Appetite-------");

	}

}
