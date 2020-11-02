package collection.set;

import java.util.HashSet;

/**
 * @FileName : HashSetDemo1.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 10. 27.
 * @project
 */
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// HashSet 객체에 String 객체 저장
		set.add("김유신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		set.add("김유신");
		set.add("홍길동");
		set.add("유관순");
		
		// HastSet 객체에 객체 갯수 조회
		int count = set.size();
		System.out.println("저장된 갯수: " + count);
		
		// HashSet 객체에 저장된 문자열 순서대로 조회
		for(String name : set) {
			System.out.println("저장된 이름: " + name);
		}
	}
}
