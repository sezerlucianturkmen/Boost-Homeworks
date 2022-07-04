package Homework_05;

public class ProductGrocery extends Products {

	private int weight;
	private boolean isOrganic;

	public ProductGrocery(String name, String brand, String origin, String expireDate, String productionDate,
			double price, double unitPrice, int stock, int weight, boolean isOrganic) {
		super(name, brand, origin, expireDate, productionDate, price, unitPrice, stock);
		this.weight = weight;
		this.isOrganic = isOrganic;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isOrganic() {
		return isOrganic;
	}

	public void setOrganic(boolean isOrganic) {
		this.isOrganic = isOrganic;
	}

	@Override
	public String toString() {
		return "ProductGrocery [weight=" + weight + ", isOrganic=" + isOrganic + "]";
	}

}
