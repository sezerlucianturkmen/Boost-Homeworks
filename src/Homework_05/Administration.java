package Homework_05;

import java.util.Scanner;

public class Administration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Scanner scanner = new Scanner(System.in);
	Market market;

	public Administration() {
		this.market = new Market();
	}

	public void menu() {

		int input = 0;
		do {

			System.out.println("-----------------MyMarket----------------\n");
			System.out.println("1-Add product(not in the stock)");
			System.out.println("2-Add product(new product but exist in the stock) ");
			System.out.println("3-List products ");
			System.out.println("Please enter any selection \n");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				System.out.println("Please define the product type...");
				String productType = scanner.nextLine();
				addProduct(productType);
				break;
			case 2:

				break;
			case 3:

				listProduct();
				break;

			default:
				break;
			}

		} while (input != 0);

	}

	private void listProduct() {

		for (Products products : market.getProducts()) {
			if (products != null) {
				System.out.println(products);
			}
		}
	}

	private void addProduct(String productType) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any brand...");
		String brand = scanner.nextLine();
		System.out.println("Enter any name...");
		String name = scanner.nextLine();
		System.out.println("Please define origin...");
		String origin = scanner.nextLine();
		System.out.println("Please define expire date...");
		String expireDate = scanner.nextLine();
		System.out.println("Please define production date...");
		String productionDate = scanner.nextLine();
		System.out.println("Define the price...");
		double price = scanner.nextDouble();
		System.out.println("Define the unitprice");
		double unitPrice = scanner.nextDouble();
		System.out.println("Enter stock quantity...");
		int stock = scanner.nextInt();

		if (productType.equalsIgnoreCase("Grocery")) {

			System.out.println("it is organic?");
			boolean isOrganic = scanner.nextBoolean();
			ProductGrocery productGrocery=new ProductGrocery(name, brand, origin, expireDate, productionDate, price, unitPrice, stock, stock, isOrganic)
			market.getProducts()[Products.index] = productGrocery;
			Urun.index++;

		} else if (urunTuru.equalsIgnoreCase("Süt")) {
			System.out.println("Günlük mü");
			boolean günlükMü = scanner.nextBoolean();
			System.out.println("Ürün tipini giriniz");
			String tip = scanner.nextLine();
			SutUrunleri sutUrunleri = new SutUrunleri(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi,
					alısFiyatı, satısFiyatı, tip, günlükMü);
			market.getUrunler()[Urun.index] = sutUrunleri;
			Urun.index++;

		} else if (urunTuru.equalsIgnoreCase("içecek")) {
			System.out.println("Gazlı içecek mi");
			boolean gazlıMı = scanner.nextBoolean();
			System.out.println("Alkollü içecek mi");
			boolean alkolluMu = scanner.nextBoolean();
			Icecek ıcecek = new Icecek(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alısFiyatı, satısFiyatı,
					gazlıMı, alkolluMu);
			market.getUrunler()[Urun.index] = ıcecek;
			Urun.index++;

		}

	}

}
