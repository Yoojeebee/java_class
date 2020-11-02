package io;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		// 지정된 경로ㅡ이 디렉토리 정보를 표현하는 File객체 생성하기
		File directory = new File("c:/");
		
		// boolean isFile() -> File객체가 표현하는 것이 파일인 경우 true가 반환된다 
		// boolean isDirectory() -> File객체가 표현하는 것이 폴더인 경우 true를 반환한다
		System.out.println("파일인가요? " + directory.isFile());
		System.out.println("디렉토리인가요? " + directory.isDirectory());
		
		// String[] list() -> 디렉토리에 포함된 모든 파일명과 하뒤디렉토리명이 지정된 배열에 반환된다
		String[] list = directory.list();
		for(String name : list) {
			System.out.println(name);
		}
	}
}
