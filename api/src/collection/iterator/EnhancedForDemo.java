package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class EnhancedForDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("이순신");
		names.add("김유신");
		names.add("강감찬");
		names.add("류관순");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}

}
