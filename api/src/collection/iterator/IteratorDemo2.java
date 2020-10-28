package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import collection.map.school.*;

public class IteratorDemo2 {
	
	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<Score>();
		list.add(new Score("김유신", 100, 100, 100));
		list.add(new Score("강감찬", 100, 100, 100));
		list.add(new Score("이순신", 100, 100, 100));
		list.add(new Score("류관순", 100, 100, 100));
		
		for(Score score: list) {
			System.out.println(score.getName() + ", " +score.getGrade());
		}
		
		System.out.println("### Iterator로 ArrayList의 객체 반복조회하기");
		Iterator<Score> itr = list.iterator();
		while(itr.hasNext()) {
			Score score = itr.next();
			System.out.println(score.getName() + ", " +score.getGrade());
		}
	}
	
}
