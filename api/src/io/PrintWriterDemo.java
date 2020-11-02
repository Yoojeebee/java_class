package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * 텍스트 파일로 기록할 때는 PrintWriter를 사용하자 
		 */
		File file = new File("c:/projects/documents/contacts.txt");
		PrintWriter writer = new PrintWriter(file);
		
		writer.println("홍기동,010-1234-5678,hong@gmail.com,서울");
		writer.println("김유신,010-1234-7684,kim@gmail.com경기");
		writer.println("강감찬,010-1234-3457,kang@gmail.com,인천");
		writer.println("이순신,010-1234-8674,lee@gmail.com,경기");
		
		writer.close();
	}
}
