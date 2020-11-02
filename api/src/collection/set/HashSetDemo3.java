package collection.set;

import java.util.HashSet;

/**
 * @FileName : HashSetDemo3.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 27.
 * @Time    :오전 11:32:47
 */
public class HashSetDemo3 {
	public static void main(String[] args) {
		HashSet<Employee> employeeSet = new HashSet<>();
		
		employeeSet.add(new Employee(100, "강감찬", "영업부", 300));
		employeeSet.add(new Employee(100, "강감찬", "영업부", 300));
		employeeSet.add(new Employee(200, "이순신", "영업부", 390));
		employeeSet.add(new Employee(300, "김유신", "총무부", 400));
		employeeSet.add(new Employee(400, "류관순", "총무부", 700));
		employeeSet.add(new Employee(500, "안중근", "연구소", 900));
		
		// employeeSet에 추가된 객체들은 같은 값(no, name, dept, salary)을 가지고 있지만
		// hashcode 값과 equals()를 통한 주소 값을 비교하면 다르다
		// 그렇기 때문에 Employee 클래스에 hashcode 와 equals() 를 재정의하여
		// no 가 같으면 같은 객체로 인식하게 만든다
		System.out.println(employeeSet);
		for(Employee e : employeeSet) {
			System.out.println(e.getNo() + ", " + e.getName() + ", " + e.getDept() + ", " + e.getSalary());
		}
	}
}
