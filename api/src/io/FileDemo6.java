package io;

import java.io.File;

public class FileDemo6 {

	public static void main(String[] args) {
		
		/*
		 * 이스케이프 문자
		 * 키보드의 문자 중 특수한 용도의 문자를 표현하는 문자
		 * \t 탭
		 * \n 개행
		 * \r 캐리지리턴
		 * \b 백스페이스
		 * \\ \
		 * \' '
		 * \" "
		 * \u0000 유니코드 문자
		 */
		
		File file1 = new File("c:\\projects\\documents\\sample.txt");
		File file2 = new File("c:/projects/documents/sample.txt");
		
		
		File file3 = new File("c:/projects/documents/sample.txt");
		File file4 = new File("c:/projects/documents", "sample.txt");
		
		
		File parent = new File("c:/products/documents");
		File file5 = new File(parent, "smaple.txt");
		
		/*
		 * File 객체의 생성자
		 * 		File(String pathname)
		 * 		File(String path, String name)
		 * 		File(File parent, String name)
		 * 		- pathname: 디렉토리명과 파일명
		 * 		- path: 디렉토리경로
		 * 		- name: 파일명
		 * 		- parent: 파일이 저장된 디렉토리를 표현하는 File 객체
		 */
	}
	
}
