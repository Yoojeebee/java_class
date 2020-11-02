package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * FileWriter의 생성자
		 * 		- FileWriter(File file)
		 * 		- FileWriter(File file, boolean append)
		 * 		- FileWriter(String pathname)
		 * 		- FileWriter(String pathname, boolean append)
		 * 
		 * PrintWriter의 생성자
		 *		// File객체가 표현하는 파일에 기록
		 * 		- PrintWriter(File file)
		 * 		
		 * 		// pathname이 가르키는 파일에 기록
		 * 		- PrintWriter(String pathname)
		 * 		
		 * 		// 전달받은 OutputStream으로 출력 
		 * 		- PrintWriter(OutputStream out)
		 * 		
		 * 		// 전달받은 Writer로 출력
		 * 		- PrintWriter(Writer out) 
		*/
		
		File file = new File("c:/projects/documents/contacts.txt");
		
		// new FileWriter(File file, boolean append) -> append가 true이면 추가
		FileWriter fw = new FileWriter(file, true);
		// new PrintWriter(FileWriter writer)
		PrintWriter writer = new PrintWriter(fw);
		// 위의 방식보다는 아래의 객체 생성 방식을 선호
		PrintWriter writer2 = new PrintWriter(new FileWriter(file, true));
		
		writer.println("홍기동,010-1234-5678,hong@gmail.com,서울");
		writer.println("김유신,010-1234-7684,kim@gmail.com경기");
		writer.println("강감찬,010-1234-3457,kang@gmail.com,인천");
		writer.println("이순신,010-1234-8674,lee@gmail.com,경기");
		
		writer2.close();
		writer.close();
		fw.close();
	}
}
