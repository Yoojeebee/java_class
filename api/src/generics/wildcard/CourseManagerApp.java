package generics.wildcard;

public class CourseManagerApp {
	public static void main(String[] args) {
		
		CourseManager manager = new CourseManager();
		
		// 일반인이 수강가능한 과정
		Course<Person> c1 = new Course<Person>();
		// 학생이 수강가능한 과정
		Course<Student> c2 = new Course<Student>();
		// 대학원생이 수강가능한 과정
		Course<GraduatedStudent> c3 = new Course<GraduatedStudent>();
		// 직장인이 수강가능한 과정
		Course<OfficeWorker> c4 = new Course<OfficeWorker>();
		
		// 수강대상이 누구나 개설과정을 등록하는 기능 실행
		manager.addCourseForAllPerson(c1);
		manager.addCourseForAllPerson(c2);
		manager.addCourseForAllPerson(c3);
		manager.addCourseForAllPerson(c4);

		// 수강대상이 Student, GraduatedStudnet인 개설과정을 등록하는 기능 실행
		//manager.addCoursForStudent(c1);
		manager.addCoursForStudent(c2);
		manager.addCoursForStudent(c3);
		//manager.addCoursForStudent(c4);

		// 수강대상이 GraduatedStudnet인 개설과정을 등록하는 기능 실행
		//manager.addCourseForGraduatedStudent(c1);
		//manager.addCourseForGraduatedStudent(c2);
		manager.addCourseForGraduatedStudent(c3);
		//manager.addCourseForGraduatedStudent(c4);

		// 수강대상이 OfficeWorker인 개설과정을 등록하는 기능 실행
		//manager.addCourseFor(c1);
		//manager.addCourseFor(c2);
		//manager.addCourseFor(c3);
		manager.addCourseFor(c4);
		
		// 수강대상이 Person, OfficeWorker인 개설과정을 등록하는 기능 실행
		manager.addCourseForNoneStudent(c1);
		//manager.addCourseForNoneStudent(c2);
		//manager.addCourseForNoneStudent(c3);
		manager.addCourseForNoneStudent(c4);		
	}
}
