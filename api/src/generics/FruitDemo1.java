package generics;

public class FruitDemo1 {
	public static void main(String[] args) {
		// 타입이 제한된 제네릭클래스 사용 
		
		// class Fruit<T extends Fruit> 클래스로 제네릭 객체 생성
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		FruitBox<Banana> box3 = new FruitBox<Banana>();
		
		// FruitBox<T> 제네릭 클래스의 자손 클래스가 아니기 때문에 오류 
		// FruitBox<String> box4 = new FruitBox<String>();
	}
}
