package collection.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo1 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("강감찬");
		set.add("김유신");
		set.add("이순신");
		set.add("안중근");
		set.add("류관순");
		set.add("허난설현");
		
		// 향상된 for문으로 HashSet의 모든 요소를 조회
		for(String name : set) {
			System.out.println(name);
		}
		
		// Iterator<E>로 HashSet의 모든 요소를 조회
		System.out.println("#### Iterator로 HashSet의 모든 요소 조회");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
	}
	
}
