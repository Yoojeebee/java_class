package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @FileName : InputStreamDemo1.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 11. 2.
 * @Time    :오전 11:07:23
 */
public class InputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		
		// 파일경로를 저장하는 String 문자열 변수 pathName
		String pathName = "C:/projects/documents/images/help.jpg";
		
		// - 파일의 데이터를 읽어오는 연결통로 생성
		// - FileIntputStream은 파일과 연결해서
		// 	 파일의 데이터를 1byte씩 읽어오는 스트림이다.
		FileInputStream in = new FileInputStream(pathName);
		
		// 1byte씩 읽어오기
		/*
		while(true) {
			int value = in.read();
			System.out.println(value);
			if(value == -1) {
				break;
			}
		}
		*/
		
		// 스트림의 끝까지 읽기
		int value = 0;
		// int read() : 1byte씩 읽어온다.
		//			  : 스트림의 끝에 도달하면 -1을 반환한다
		//			  : 읽어온 값이 -1이 나올때 까지 읽어서 value에 값을 저장하고
		//			  : while문 블록내에서 필요한 작업을 수행한다
		while( (value = in.read()) != -1 ) {
			System.out.print(value + " ");
		}
		
		// 연결통로 닫기		
		in.close();
	}
}
