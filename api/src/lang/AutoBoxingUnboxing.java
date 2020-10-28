package lang;

public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		// 오토박싱, 오토언박싱
		/*
		 * 기본자료형과 Wrapper 객체간의 연산이 가능하게 하는 것
		 * - 오토박싱이란?
		 * 		변수의 타입이 Wrapper 클래스 타입이면
		 * 		Wrapper 객체를 자동 생성하고, 기본자료형 값을 객체에 담는다 
		 * 
		 * - 오토언박싱이란?
		 * 		변수의 타입이나 연산의 대상이 되는 값의 타입이 기본자료형이면
		 * 		자동으로 Wrapper 객체의 xxxValue() -> (intValue(), doubleValue() 등) 실행해서
		 *		획득한 기본자료형을 연산에 사용
		 */
		
		// 오토박싱			// 실제 실행 코드
		Integer a = 10;		// Integer a = new Integer(10);
		Double b = 3.14;	// Double b = new Double(3.14);
		Boolean c = true;	// Boolean c = new Boolean(true);
		
		int x = 20;
		double y = 4.7;
		
		// 오토언박싱			// 실제 실행 코드
		int reuslt1 = x + a;	// x + a.intValue()
		double result2 = y + b;	// y + b.doubleValue()
		
		Sample sample = new Sample();
		// 컴파일 전			// 컴파일 후
		sample.plus(10, 20);	// sample.plus(10, 10)
		sample.plus2(10, 10);	// sample.plus2(new Integer(10), new Integer(10))
	}
	
	static class Sample {
		public void plus(int x, int y) {
			System.out.println("기본자료형 값 연산");
			System.out.println(x + y);
		}
		
		public void plus2(Integer x, Integer y) {
			System.out.println("Wrapper객체형 값의 연산");
			System.out.println(x + y);
		}
	}
}
