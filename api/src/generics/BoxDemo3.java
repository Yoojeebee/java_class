package generics;

public class BoxDemo3 {
	public static void main(String[] args) {
		// 제네릭 와일드 카드 사용
		
		// 제네릭 클래스 class Box<T> { ... }
		// 참조변수에 제네릭 와일드 카드를 사용하면,
		// 와일드카드로 지정한 하위클래스르 담을 수 있는 제네릭객체를 생성할 수 있다.
		Box<? extends Fruit> box1 = null;
		
		// appleBox 참조변수는 Box 객체이면서 Fruit 타입의 자손들까지 다룰 수 있는 참조변수이다.
		Box<? extends Fruit> appleBox = new Box<Apple>();
		//appleBox.addItem(new Apple("맛없는 사과", "낙과"));
		box1 = appleBox;
		
		Box<? extends Fruit> box2 = null;
		Box<? extends Fruit> bananaBox = new Box<Banana>();
		//bananaBox.addItem(new Banana("맛없는 바나나", "낙과"));
		box2 = bananaBox;
		
	}
}
