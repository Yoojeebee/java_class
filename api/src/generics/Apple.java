package generics;

public class Apple extends Fruit {
	public String category;
	
	public Apple() {}
	public Apple(String name, String category) {
		super(name);
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		// name은 상위클래스 Fruit의 멤버변수다
		// name은 private 접근제한자로 은닉화되어 있다.
		// 공개된 getName() getter메소드로 Fruit의 name값을 조회한 것
		return "Apple [name=" + getName() + ", category=" + category + "]";
	}
	
}
