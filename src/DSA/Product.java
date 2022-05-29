package DSA;

public class Product {
	private String id;
	private String name;
	private double price;
	private int number;
	
	public Product(String id, String name, double price, int number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + ", number=" + number ;
	}
	
}
