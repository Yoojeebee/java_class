package generics;

public class ArrayUtils {
	// 배열을 전달받아서 오름차순으로 정렬해서 반환하는 메서드
	
	// 제네릭 메소드
	// 메소드의 반환타입 앞에 <T> 제네릭 메소드의 타입변수를 지정
	
	/* 예)
	 * 	Apple[] arr = new Apple[3];
	 * 		1. ArrayUtils.<Apple>printArray(arr);
	 * 		2. ArrayUtils.printArray(arr); // 타입추론을 통해 T의 타입을 추론
	 */
	public static <T> void printArray(T[] array) {
		for(T t : array) {
			System.out.println(t);
		}
	}
}
