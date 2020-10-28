package generics.wildcard;

// 강의
// 타입변수 T는 강의에 참여가능한 사람의 타입을 지정
public class Course<T> {
	/*
	 * Course<T>의 T타입이 제한없음
	 * test(Course<T> c)
	 * 
	 * Course<T>의 T타입이 Student 및 Student 하위타입
	 * test(Course<? extends Student> c)
	 * 
	 * Course<T>의 T타입이 OfficeWorker 및 OfficeWorker 상위 타입
	 * text(Course<? extends OfficeWorker> c)
	 **/
}
