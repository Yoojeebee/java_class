package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		System.out.println("[파일 복사 프로그램]");
		String src = "C:/projects/documents/a.zip";
		String dest = "C:/projects/documents/a.zip.bak";
		String dest2 = "C:/projects/documents/a.zip.bak2";
		
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);
		
		System.out.println("##### 파일 복사를 시작합니다.");
		long startUnixTime = System.currentTimeMillis();
		int value = 0;
		while ( (value = in.read()) != -1 ) {
			out.write(value);
		}
		
		in.close();
		out.close();
		long endUnixTime = System.currentTimeMillis();
		
		long runningTime = endUnixTime - startUnixTime;
		System.out.println("소요시간 : " + runningTime + "밀리초");
		System.out.println("파일 복사가 완료되었습니다.");
		
		/////////////////////////////////////////////////////////////
		
		System.out.println("[파일 복사 프로그램2]");
		InputStream in2 = new FileInputStream(src);
		OutputStream out2 = new FileOutputStream(dest2);
		
		System.out.println("##### 파일 복사를 시작합니다.");
		long startUnixTime2 = System.currentTimeMillis();
		int length = 0;
		byte[] buf = new byte[1024 * 8];
		while( (length = in2.read(buf)) != -1) {
			out2.write(buf, 0, length);
		}
		
		long endUnixTime2 = System.currentTimeMillis();
		
		in2.close();
		out2.close();
		long runningTime2 = endUnixTime2 - startUnixTime2;
		System.out.println("소요시간 : " + runningTime2 + "밀리초");
		System.out.println("파일 복사가 완료되었습니다.");
	}
}
