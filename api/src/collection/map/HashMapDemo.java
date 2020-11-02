package collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		// HashMap 객체에 key, value의 쌍으로 저장
		map.put("hong", "홍길동");
		map.put("kim", "김유신");
		map.put("kang", "강감찬");
		map.put("lee", "이순신");
		map.put("ryu", "류관순");
		
		// HashMap 객체에 저장된 값을 key로 조회하기
		String value1 = map.get("lee");
		String value2 = map.get("kang");
		String value3 = map.get("park"); // key가 존재하지 않으면 null 반환
		System.out.println(value1 + ", " + value2 + ", " + value3);
		
		// HashMap 객체에 지정된 key가 존재하는지 확인
		// boolean containsKey(Object key)
		boolean result1 = map.containsKey("lee");
		boolean result2 = map.containsKey("park");
		System.out.println(result1 + ", " + result2);
		
		// HashMap 객체에서 지정된 key로 저장된 key, value 쌍을 삭제
		// V remove(Object key)
		map.remove("kang");
		System.out.println("현재 HashMap: " + map);
		
		// HashMap 객체에서 저장된 모든 key의 집합을 획득
		// Set<K> keySet()
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("저장된 key: " + key + ", 저장된 value: " + map.get(key));
		}
	}
	
}
