package Homework_05;

public class Products {

	private String name;
	private String brand;
	private String origin;

	private String expireDate;
	private String productionDate;
	private double price;
	private double unitPrice;
	private int stock;

	public Products(String name, String brand, String origin, String expireDate, String productionDate, double price,
			double unitPrice, int stock) {
		super();
		this.name = name;
		this.brand = brand;
		this.origin = origin;
		this.expireDate = expireDate;
		this.productionDate = productionDate;
		this.price = price;
		this.unitPrice = unitPrice;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", brand=" + brand + ", origin=" + origin + ", expireDate=" + expireDate
				+ ", productionDate=" + productionDate + ", price=" + price + ", unitPrice=" + unitPrice + ", stock="
				+ stock + "]";
	}

}
