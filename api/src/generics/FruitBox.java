package generics;

// T에 지정할 수 있는 클래스는 Fruit의 자손만 가능
public class FruitBox<T extends Fruit> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
