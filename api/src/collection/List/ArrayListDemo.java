package collection.List;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// String 객체를 여러 개 저장하는 ArrayList 객체 생성
		ArrayList<String> list1 = new ArrayList<>();
		
		// ArrayList 객체에 다른 객체 저장하기
		// boolean add(E e)
		list1.add("이순신");
		list1.add("김유신");
		list1.add("강감찬");
		list1.add("류관순");
		list1.add("안중근");
		
		// ArrayList 객체에 저장된 모든 객체 조회
		for(String name : list1) {
			System.out.println(name);
		}
		
		// ArrayList 객체를 비운다.
		// void clear() : ArrayList 객체를 비운다
		list1.clear();
		
		// ArrayList 객체에서 순번으로 조회
		/*
		 * String name1 = list1.get(0);
		 * String name2 = list1.get(1);
		 * String name3 = list1.get(2);
		 * String name4 = list1.get(3);
		 * String name5 = list1.get(4);
		 * System.out.println(name1);
		 * System.out.println(name2);
		 * System.out.println(name3);
		 * System.out.println(name4);
		 * System.out.println(name5);
		*/
		
		// ArrayList 객체가 비어 있는지 조회
		if(list1.isEmpty()) {
			System.out.println("비어있다!");
			// ArrayList객체에 저장된 객체의 갯수 조회
			// int size()
		} else {
			System.out.println("안 비어있다!");
			System.out.println(list1.size() + " 명이 저장되어 있습니다.");
		}
	}
}


