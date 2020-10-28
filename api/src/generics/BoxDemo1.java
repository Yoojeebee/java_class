package generics;

public class BoxDemo1 {
	public static void main(String[] args) {
		// 타입변수 T에 String 타입이 지저된 객체 생성 
		Box<String> box1 = new Box<String>();
		// Box 객체는 String 객체만 저장할 수 있다
		// 타입 안전성 보장
		box1.addItem("김유신");
		// Box 객체에 저장된 객체를 조회하면 항상 String 타입의 객체가 반환된다
		// 타입체크 및 클래스 형변환이 필요없다
		String name =box1.getItem();
		System.out.println("이름: " + name);
		
		// 타입변수 T에 String 타입이 지정된 객체 생성
		// 오른쪽 <> 에는 타입지정을 생략 가능
		Box<String> box2 = new Box<>();
		box2.getItem();
	}
}
