package collection.map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("양준모");
		names.add("주단비");
		names.add("박연우");
		names.add("이승우");
		names.add("성한결");
		names.add("유정국");
		names.add("김선영");
		names.add("김우중");
		names.add("문주은");
		names.add("권택수");
		names.add("정충만");
		names.add("김재은");
		names.add("이정상");
		
		// 성이 Key, 이름 Value
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * 1. ArrayList에 저장된 이름을 하나씩 조회한다
		 * 	  향상된 for문 사용
		 * 2. 조회된 이름에서 첫번째 글자만 읽어온다 -> 성씨 획득
		 * 	  String 객체의 String subString(int begin, int end) 메소드 사용
		 * 3. HashMap 객체에 2번에서 획득한 성씨가 key로 존재하는지 체크한다
		 *    HashMap 객체의 boolean contains(String key) 메소드 사용
		 * 4. 존재하지 않으면
		 * 					HashMap.put(성, 1)을 저장
		 *    존재하면
		 *    				map에서 2번에서 획득한 성씨로 값을 조회한 다음
		 *    				HashMapd의 int get(String key) 메소드 사용
		 *    				그 성씨의 숫자를 1증가시켜서 다시 저장
		 *    				HashMap의 put(String key, Integer value) 메소드 사용
		 *    				Map에 저장된 모든 key, value 쌍을 출력
		 * */
		int size = names.size();
		for(int i = 0; i < size; i++) {
			// 이름이 저장된 ArrayList 객체에서 이름을 가져온다
			String lastName = names.get(i);
			// 가져온 이름에서 성이 있는 첫 번재(index 0번째 자리)자리 값을 가져온다
			char name = lastName.charAt(0);
			
			// 가져온 성이 map에 없을 경우 map 객체에 저장
			String first = String.valueOf(name);
			if(map.get(first) == null) {
				//String key = String.valueOf(name);
				map.put(first, 1);
			}
			// 가져온 성이 이미 map 객체에 있다면 map에서 value 값을 꺼내서 증가 시킨 다음
			// 증가시킨 값과 key 값을 다시 객체에 초기화
			else {
				int num = map.get(first) + 1;
				map.put(first, num);
			}
		}
		System.out.println("HashMap 값: " + map);
		
		for(String str : names) {
			// ArrayList의 객체에 저장된 String 값에서 0번째 자리 값(성)을 name에 초기화
			String name = str.substring(0, 1);
			
			// HashMap 객체에 String형 값 name이 없다면 HashMap 객체에 초기화
			if(!map.containsKey(name)) {
				map.put(name, 1);
			}
			// HashMap 객체에 값이 존재하면 int형 변수 num에 String형 값 name에 맞는 키 값을 조회한 다음 value + 1
			// num에 초기화
			else {
				int num = map.get(name) + 1;
				map.put(name, num);
			}
		}
		System.out.println("HashMap 값: " + map);
	}
}
