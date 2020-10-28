package generics;

public class Banana extends Fruit {
	private String country;
	
	public Banana() {}
	public Banana(String name, String country) {
		super(name);
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
