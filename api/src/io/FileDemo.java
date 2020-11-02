package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
	
	public static void main(String[] args) {
		// File 객체를 생성할 때는 생성자의 인자로 파일이 위치한 디렉토리 경로와 파일명을 지정한다
		File file = new File("C:\\projects\\documents\\sample.txt");
		
		// String getName() -> 파일의 이름을 반환한다
		String fileName = file.getName();
		System.out.println("파일명: " + fileName);
		
		// String getParent() -> 파일이 저장되어 있는 디렉토리명을 반환한다
		String path = file.getParent();
		System.out.println("디렉토리: " + path);
		
		// String getAbsolutePath() -> 파일명의 절대경로(c:/ 로부터 시작하는 경로)와 파일명을 반환한다
		String pathAneName = file.getAbsolutePath();
		System.out.println("전체경로 및 이름: " + pathAneName);
		
		// long getLength() -> 파일의 크기를 byte 단위로 반환한다
		long filesize = file.length();
		System.out.println("파일크기: " + filesize);
		
		// long lastModified() -> 파일의 최종수정일자에 대한 Unixtime을 반환한다
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println("최종 수정 일자: " + date);
	}
	
}
