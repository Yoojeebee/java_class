package io;

import java.io.FileWriter;
import java.io.IOException;

public class FilterDemo {
	public static void main(String[] args) throws IOException {
		// 텍스트를 파일로 출력하기
		FileWriter writer = new FileWriter("c:/projects/documents/scores.txt");
		
		// void write(String text) -> text를 파일에 기록한다
		writer.write("김유신,100,100,100\n");
		writer.write("강감찬,90,90,90\n");
		writer.write("이순신,80,80,80\n");
		
		writer.close();
	}
}
