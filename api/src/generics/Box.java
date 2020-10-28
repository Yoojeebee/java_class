package generics;

// 제네릭 클래스
// 클래스에서 '<>' 표기법으로 타입변수가 지정된 클래스
// 객체 생성시점에 타입변수에 대한 클래스를 지정할 수 있다.
public class Box<T> {
	private T item;
	
	public void addItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
