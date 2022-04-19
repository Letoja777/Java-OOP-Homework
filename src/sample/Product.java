package sample;

public class Product {

	private int price;
	private int weight;
	private String name;
	
	public Product(int price, int weight, String name) {
		super();
		this.price = price;
		this.weight = weight;
		this.name = name;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
	    return name;
	  }

	public void setName(String name) {
	    this.name = name;
	  }
	
	public int getPrice() {
	    return price;
	  }

	public void setPrice(int price) {
	    this.price = price;
	  }
	
	public int getWeight() {
	    return weight;
	  }

	public void setWeight(int weight) {
	    this.weight = weight;
	  }
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", weight=" + weight + ", name=" + name + "]";
	}

}
