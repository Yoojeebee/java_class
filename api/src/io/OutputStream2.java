package io;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @FileName : OutputStream2.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 11. 2.
 * @Time    :오전 11:13:51
 */
public class OutputStream2 {

	public static void main(String[] args) throws IOException {
		String source = "http://www.sisajournal.com/news/photo/202011/207301_113888_2128.jpg";
		String dest = "C:/projects/documents/images/sample.jpg";
		
		URL url = new URL(source);
		InputStream in = url.openStream();
		OutputStream out = new FileOutputStream(dest);
		
		int value = 0;
		while ((value = in.read()) != -1) {
			System.out.println("읽은 값: " + value);
			out.write(value);
			
		}
		
		in.close();
		out.close();
	}
	
}
