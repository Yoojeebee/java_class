package collection.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		// TreeSet은 오름차순으로 정렬됨
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			int number = (int)(Math.random() * 45) + 1;
			lotto.add(number);
			if(lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println("로또 추첨번호: " + lotto);
	}
}
