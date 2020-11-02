package generics;

public class BoxDemo2 {
	public static void main(String[] args) {
		// Apple 객체를 담을 수 있는 Box 객체 생성
		Box<Apple> box1 = new Box<Apple>();
		// Box 객체에 객체 담기 -> Apple 객체만 담을 수 있다
		box1.addItem(new Apple("빨간사과","부사"));
		
		// box.getItem() 반환타입은 Apple이기 때문에 box1 객체가 가지고 있는 Apple 객체의 주소가
		// item1에 초기화
		Apple item1 = box1.getItem();
		System.out.println(item1.getName() + ", " + item1.getCategory());

		// Banana 객체를 담을 수 있는 Box 객체 생성
		Box<Banana> box2 = new Box<Banana>();
		box2.addItem(new Banana("빨간사과","필리핀"));
		
		// Fruit 객체(Fruit, Apple, Banana 등)를 담을 수 있는 Box객체 생성
		// 타입변수를 부모타입(Fruit)로 지정하면, 모든 하위객체를 담을 수 있다
		// 단, 자식객체를 사용할 때는 클래스 형변환이 필요
		Box<Fruit> box3 = new Box<>();
		box3.addItem(new Fruit("토마토"));
		Fruit item3 = box3.getItem();
		box3.addItem(new Apple("단단한 사과", "홍옥"));
		Apple item4 = (Apple)box3.getItem();
		box3.addItem(new Banana("꼬맹이 바나나", "미국"));
		Banana item5 = (Banana)box3.getItem();
		
		// 제네릭 클래스로 객체를 생성할 때는 차모변수에 지정된 타입변수와 생성자에 지정된 타입변수는 일치해야된다
		// 상속관계에 있는 클래스라 하더라도 아래와 같이 적을 수는 없다.
		//Box<Fruit> box4 = new Box<Apple>();
		//Box<Fruit> box5 = new Box<Banana>();
	}
}
