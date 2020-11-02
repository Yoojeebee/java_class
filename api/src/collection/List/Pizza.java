package collection.List;

public class Pizza {
	private String name;
	private String size;
	private int price;
	
	public Pizza() { super(); }
	public Pizza(String name, String size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
