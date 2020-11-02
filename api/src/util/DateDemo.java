package util;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toLocaleString());
		System.out.println(now.getTime());
		
		Date zero = new Date(0);
		System.out.println(zero);
	}
}
