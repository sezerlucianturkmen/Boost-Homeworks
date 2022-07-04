package Homework_05;

public class ProductDairy extends Products {

	private String type;
	private String amount;
	private boolean withoutLactose;

	public ProductDairy(String name, String brand, String origin, String expireDate, String productionDate,
			double price, double unitPrice, int stock, String type, String amount, boolean withoutLactose) {
		super(name, brand, origin, expireDate, productionDate, price, unitPrice, stock);
		this.type = type;
		this.amount = amount;
		this.withoutLactose = withoutLactose;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public boolean isWithoutLactose() {
		return withoutLactose;
	}

	public void setWithoutLactose(boolean withoutLactose) {
		this.withoutLactose = withoutLactose;
	}

	@Override
	public String toString() {
		return "ProductDairy [type=" + type + ", amount=" + amount + ", withoutLactose=" + withoutLactose + "]";
	}

}
