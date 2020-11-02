package io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @FileName : InputStreamDemo3.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 11. 2.
 * @Time    :오전 11:07:30
 */
public class InputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		String address = "https://en.wikipedia.org/wiki/Main_Page";
		
		URL url = new URL(address);
		InputStream in = url.openStream();
		
		int value = 0;
		while ( (value = in.read()) != -1 ) {
			System.out.print((char)value);
		}
	}
}
