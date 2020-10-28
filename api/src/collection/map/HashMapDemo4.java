package collection.map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo4 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("no", 10);
		map.put("name", "블랙핑크");
		map.put("members", new String[] {"지수", "제니", "로제", "리사"});
		
		ArrayList<Album> list = new ArrayList<Album>();
		list.add(new Album("SQUARE ONE", "싱글", 2016));
		list.add(new Album("SQUARE TWO", "싱글", 2016));
		list.add(new Album("마지막처럼", "싱글", 2017));
		list.add(new Album("SQUARE UP", "미니", 2018));;
		
		map.put("albumList", list);
		
		// Map에서 값을 꺼낼 시 형변환이 필요
		int no = (Integer)map.get("no");
		String name = (String)map.get("name");
		String[] members = (String[])map.get("members");
		ArrayList<Album> albumList = (ArrayList<Album>)map.get("albumList");
		
		System.out.println("no: " + no);
		System.out.println("name: " + name);
		for(String member : members) {
			System.out.println("member: " + member);
		}
		for(Album album : albumList) {
			System.out.println("album: " + album.title + ", " + album.type + ", " + album.year);
		}
	}

	static class Album {
		String title;	// 제목
		String type;	// 정규, 미니, 싱글
		int year;		// 발매년도
		
		public Album(String title, String type, int year) {
			super();
			this.title = title;
			this.type = type;
			this.year = year;
		}
	}
}
