package io;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		File folder = new File("C:\\projects\\documents\\images");
		
		// boolean mkdir() -> File 객체가 표현하는 디렉토리를 생성
		folder.mkdir();
		
		File folders = new File("C:\\projects\\documents\\images\\product\\thumbnails\\small");
		
		// boolean mkdirs() -> File객체가 표현하는 하위 디렉토리까지 한번에 생성
		folders.mkdirs();
	}
}
