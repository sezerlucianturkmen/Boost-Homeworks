package Homework_05;

public class ProductCosmetics extends Products {

	private String sex;
	private boolean isLocal;

	public ProductCosmetics(String name, String brand, String origin, String expireDate, String productionDate,
			double price, double unitPrice, int stock, String sex, boolean isLocal) {
		super(name, brand, origin, expireDate, productionDate, price, unitPrice, stock);
		this.sex = sex;
		this.isLocal = isLocal;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isLocal() {
		return isLocal;
	}

	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}

	@Override
	public String toString() {
		return "ProductCosmetics [sex=" + sex + ", isLocal=" + isLocal + "]";
	}

}
