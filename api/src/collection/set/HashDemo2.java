package collection.set;

import java.util.HashSet;

public class HashDemo2 {

	public static void main(String[] args) {
		// Set<E>, List<E>의 구현객체의 제네릭타입변수의 값은
		// 항상 클래스나 인터페이스 타입이어야 한다.
		// 따라서, 기본자료형(int, long, double)값을 저장해야 하는 경우
		// 기본자료형타입 대신 Wrapper 클래스 타입을 제네릭타입으로 지정해야 한다
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10); // set1.add(new Integer(10));
		set1.add(20); // set1.add(new Integer(20));
		set1.add(30); // set1.add(new Integer(30));
		
		// set1에 Integer 객체를 가져온다 - > Integer 객체에 저장된 정수값을 num에 대입
		for(int num : set1) {
			System.out.println(num);
		}
	}
}
