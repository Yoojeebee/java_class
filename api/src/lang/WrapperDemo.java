package lang;

public class WrapperDemo {

	public static void main(String[] args) {
		// 기본자료형타입 변수 a에 10을 대입
		int a = 10;
		
		// Integer 타입의 변수 b에 숫자 10을 가지고 있는
		// Integer 객체(b)의 주소값이 대입
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		
		// Integer 객체가 가지고 있는 정수값 조회
		int value1 = b.intValue();
		int value2 = b.intValue();
		System.out.println(a + value1 + value2);
		
		// Double 객체가 가지고 있는 실수값 조회
		double x = 3.14;
		Double y = new Double(3.14);
		Double z = new Double("3.14");
		
		double value3 = y.doubleValue();
		double value4 = y.doubleValue();
		System.out.println(x + y + z);
	}

}
