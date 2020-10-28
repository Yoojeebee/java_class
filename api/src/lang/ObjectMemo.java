package lang;

public class ObjectMemo {

	public static void main(String[] args) {
		Person p1 = new Person(10, "김유신");
		Person p2 = new Person(10, "김유신");
		
		// == : 두 객체의 주소값이 동일한지 확인
		System.out.println(p1 == p2);
		
		// ** equals(Object obj) 재정의 전
		// - Object의 equals(Object obj) 메소드를 사용해서 두 객체가 동일한지 비교
		//   두 객체가 동일한지 비교하기
		// - Object의 equals() 메소드는 두 객체의 주소값을 비교하기 때문에
		//   p1객체와 p2객체 서로 다른 객체임으로 false값이 출력됨
		
		// ** equals(Object obj) 재정의 후
		// - Person 클래스에서 no번호가 동일하면
		//   같은 객체로 판단하도록 Object의 equals(Object obj)를 재정의
		// - p1 객체와 p2객체가 가지고 있는 no값이 동일하기 때문에
		//   equals() 메소드 재정의 후에는 true값이 출력됨
		System.out.println(p1.equals(p2));
		
		// 객체의 해시코드값을 출력
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// 출력문에서 toString()을 사용하면 클래스이름@16진수해시코드 출력됨
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		// 출력문에서 참조변수를 인자로 사용하면
		// 참조변수 .toString() 실행결과가 출력됨
		System.out.println(p1);
		System.out.println(p2);
	}
	
	static class Person {
		int no;
		String name;
		
		public Person(int no, String name) {
			this.no = no;
			this.name = name;
		}
		
		// Person 객체의 hashcode값은 Person객체의 no가 반환되도록
		// 재정의함
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.no;
		}
		
		// Person 객체의 번호가 동일하면 equals 메소드의
		// 실행결과가 true가 되도록 재정의
		@Override
		public boolean equals(Object obj) {
			Person other = (Person)obj;
			boolean result = (this.no == other.no);
			return result;
		}
		
		@Override
		public String toString() {
			return "[name" + no + ", name:" + name + "]";
		}
	}
	
}
