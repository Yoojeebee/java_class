package generics.wildcard;

// 와일드카드의 다형성
public class CourseManager {
	// 수강대상에 상관없이 개설과정을 등록할 수 있는 메서드
	public void addCourseForAllPerson(Course<?> course) {
		// 아래의 모든 Course 객체를 전달받는 메서드
		/*
		 * Course<Person> c1 = new Course<Person>();
		 * Course<Student> c2 = new Course<Student>();
		 * Course<GraduatedStudent> c3 = new Course<GraduatedStudent>();
		 * Course<OfficeWorker> c4 = new Course<OfficeWorker>();
		 */
	}
	
	// 수강대상이 대학생, 대학원생이 개설과정을 등록할 수 있는 메서드
	public void addCoursForStudent(Course<? extends Student> course) {
		/*
		 * Course<Student> c2 = new Course<Student>();
		 * Course<GraduatedStudent> c3 = new Course<GraduatedStudent>();
		 */
	}
	
	// 수강대상이 대학원생이 개설과정을 등록할 수 있는 메서드
	public void addCourseForGraduatedStudent(Course<? extends GraduatedStudent> course) {
		// Course<GraduatedStudent> c3 = new Course<GraduatedStudent>();
	}
	
	// 수강대상이 직장인이 개설과정을 등록할 수 있는 메서드
	public void addCourseFor(Course<? extends OfficeWorker> course) {
		// Course<OfficeWorker> c4 = new Course<OfficeWorker>();
	}
	
	// 수강대상이 학생이 아닌 일반인이 수강가능한 코스 등록하기
	public void addCourseForNoneStudent(Course<? super OfficeWorker> course) {
		// Course<Person> c1 = new Course<Person>();
	}
	
	/*
	 * Box<Apple> b1 = new Box<>();
	 * b1.addItem(new Apple());
	 * 
	 * Box<Book> b2 = new Book<>();
	 * b2.addItem(new Book());
	 * 
	 * Box<?> box = b1;	// Box<?>는 Box의 타입변수가 T가 어떤 타입이든 상관없다.
	 * Box<?> box = b2;
	 * 
	 * Box<Megazine> b3 = new Box<>();
	 * b3.addItem(new Megazine());
	 * 
	 * Box<Comics> b4 = new Book<>();
	 * b4.addItem(new Comics());
	 * 
	 * Box<? extends Book> box = b3; // Box<? extends Book>는 Box의 타입변수가 T가
	 * BoX<? extends Book> box = b4; // Book 혹은 Book의 하위타입인 것만 참조가능
	 * 
	 * Box<Book> b5 = new Box<>();
	 * b5.addItem(new Book());
	 * Box<Object> b6 = new Box<>(); // 의미가 없는 Box 객체
	 * b6.addItem(new Object());     // Object는 프로그래멩서 실질적인으로 사용하지 않음
	 * 
	 * Box<? super Book> box = b5;   // Box<? super Book>는 Box의 타입변수가 T가
	 * Box<? super Book> box = b6;	 // Book 혹은 Book 상위타입인 것만 참조가능
	 * */
	
}
