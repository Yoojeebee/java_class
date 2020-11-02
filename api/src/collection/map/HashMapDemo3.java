package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo3 {
	
	public static void main(String[] args) {
		Iphone p1 = new Iphone();
		Galaxy p2 = new Galaxy();
		
		Scanner sc = new Scanner(System.in);
		// HashMap의 key 값에 숫자를 Value 값에 Interface Phone을 넣는다
		// Phone 또한 클래스타입
		HashMap<Integer, Phone> map = new HashMap<Integer, Phone>();
		// 키 값에 1, 2와 값에 Iphone, Galaxy 참조변수를 넣는다.
		// Phone 클래스 타입은 Iphone, Galaxy의 상위클래스이므로 가능
		map.put(1, p1);
		map.put(2, p2);
		
		System.out.print("사용할 전화기 종류를 입력(1. 아이폰 / 2. 갤럭시): ");
		int number = sc.nextInt();
		
		// 상위 클래스 타입 Phone의 참조변수 p에 map 객체 중 number에 해당하는 키 값을 가지고 있는 객체를 p에 초기화
		Phone p = map.get(number);
		p.call();
		
		sc.close();
	}
	
}
