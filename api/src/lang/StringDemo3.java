package lang;

public class StringDemo3 {

	public static void main(String[] args) {
		/*
		 * 문자열과 숫자간의 변환
		 */
		
		// 문자열을 숫자로 변환
		// "1234" -> 1234
		// "2.14" -> 2.14
		// 정수로 바꾸기
		//		Integer.parseInt(String text) -> 반환타입: int
		//		Long.parseLong(String text) -> 반환타입: long
		// 실수로 바꾸기
		//		Double.parseDouble(String text) -> 반환타입: double
		int number1 = Integer.parseInt("1234");
		long number2 = Integer.parseInt("400");
		System.out.println(number1 + number2);
		
		double number3 = Double.parseDouble("3.15");
		double number4 = Double.parseDouble("5.11");
		System.out.println(number3 + number4);		
		
		// 숫자를 문자열로 변환
		// 1234 -> "1234"
		// 2.14 -> "2.14"
		
	}

}
