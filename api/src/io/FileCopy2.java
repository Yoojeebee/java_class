package io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCopy2 {

	public static void main(String[] args) throws IOException {
		File src = new File("c:/projects/documents/a.zip");
		File dest = new File("c:/prjects/documents/a.zip.bak3");
		
		System.out.println("### 파일 복사를 시작합니다.");
		long startTime = System.currentTimeMillis();
		
		// Apache Commons io 라이브러리를 사용해서 파일 복사하기
		FileUtils.copyFile(src, dest);
		
		long endTime = System.currentTimeMillis();
		long runningTime = endTime - startTime;
		System.out.println("소요시간: " + runningTime + "밀리초");
		System.out.println("### 파일 복사를 종료합니다.");
		String r = 3 + 6 +"Abc" + 1 + 5;
	
		System.out.println(r);
	}

}
