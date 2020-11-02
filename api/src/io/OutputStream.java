package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @FileName : OutputStream.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 11. 2.
 * @Time    :오전 11:13:41
 */
public class OutputStream {
	public static void main(String[] args) throws IOException {
		String pathname = "C:/projects/documents/a.txt";
		FileOutputStream out = new FileOutputStream(pathname);
		
		// 메모장에서는 65 -> A / 66 -> B / ... / 70 -> F
		// UTF-8코드 char형 변환
		out.write(65);
		out.write(66);
		out.write(67);
		out.write(68);
		out.write(69);
		out.write(70);
		
		out.close();
	}
}
