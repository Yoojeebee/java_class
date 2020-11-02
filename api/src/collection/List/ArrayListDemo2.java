package collection.List;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		Pizza p1 = new Pizza("시리얼 칠리크랩", "L", 34900);
		Pizza p2 = new Pizza("뉴욕 스트립 스테이크", "L", 34900);
		Pizza p3 = new Pizza("직화 스테이크", "S", 33900);
		Pizza p4 = new Pizza("포테이토", "S", 25900);
		Pizza p5 = new Pizza("블랙앵거스 스테이크", "L", 34900);
		
		ArrayList<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(p1);
		pizzaList.add(p2);
		pizzaList.add(p3);
		pizzaList.add(p4);
		pizzaList.add(p5);
		
		System.out.println("#### 사이즈가 S인 피자 이름을 출력하기");
		for(Pizza pizza : pizzaList ) {
			if("S".equals(pizza.getSize())) {
				System.out.println(pizza.getName());
			}
		}
		
		System.out.println("#### 가격이 30,000원 이하인 피자의 이름을 출력하기");
		for(Pizza pizza : pizzaList ) {
			if(pizza.getPrice() <= 30_000) {
				System.out.println(pizza.getName() + ", " + pizza.getPrice());
			}
		}

		System.out.println("#### 스테이크 피자의 메뉴명을 출력하기");
		for(Pizza pizza : pizzaList ) {
			if(pizza.getName().contains("스테이크")) {
				System.out.println(pizza.getName());
			}
		}
		
	}
}
