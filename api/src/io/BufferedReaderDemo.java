package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		/*
		 * FileReader
		 *		- 텍스트 파일을 직접 읽어오는 Reader클래스
		 * BufferedReader
		 * 		- 텍스트내용을 한 줄씩 읽어오는 메소드를 제공하는 Reader클래스
		 * 		- 생성자 : new BufferedReader(Reader reader)
		 * 		- 메서드
		 * 			- String readLine() -> 텍스트를 한 줄씩 읽어온다. 
		 * 			  더 이상 읽어올 내용이 없으면 null을 반환
		 * 			  while문과 함께 사용하면 텍스트내용을 끝까지 읽어올 수 있다.
		*/
		
		File file = new File("c:/projects/documents/sample.txt");
		
		// 텍스트파일을 직접 읽어올 수 있는 Reader클래스
		String pathname = "C:/projects/documents/scores.txt";
		FileReader fr = new FileReader(file);
		FileReader fr2 = new FileReader("C:/projects/documents/scores.txt");
		FileReader fr3 = new FileReader(new File(pathname));
		// 텍스트파일에서 내용을 한 줄씩 읽어오는 기능이 내장된 Reader클래스
		BufferedReader reader = new BufferedReader(fr2);
		BufferedReader reader2 = new BufferedReader(new FileReader(new File("c:/projects/documents/sample.txt")));
		
		String line = null;
		// while( (line = reader.readLine()) != null ) { ... } 에서 조건문의 연산순서
		// 		1. reader.readLine() -> 메소드로 텍스트파일에서 1줄을 읽어온다.
		// 		2. line = reader.readLine() 읽어온 텍스트를 변수 line에 대입한다.
		// 		3. (line = reader.readLine()) != null 변수 line의 값이 null이 아니면 true로 판정
		//		4. true일 경우 System.out.println(line); 수행문 실행
		//		5. null값이 아닐 때까지 반복
		while( (line = reader.readLine()) != null ) {
			//System.out.println(line);
			
			String[] items = line.split(",");
			String name = items[0];
			int kor = Integer.parseInt(items[1]);
			int eng = Integer.parseInt(items[2]);
			int math = Integer.parseInt(items[3]);
			int total = kor + eng + math;
			int average = total/3;
			
			System.out.println(name + ": " + total + ", " + average);
		}
		
		fr.close();
		fr2.close();
		fr3.close();
		reader.close();
		reader2.close();
	}
	
}
