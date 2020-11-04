package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BridgeStreamDemo {
	
	public static void main(String[] args) throws IOException {
		// keyboard 입력을 1byte씩 읽어오는 InputStream 연결통로 획득
		InputStream inputStream = System.in;
		// keyboard 입력을 1글자씩 읽어오기 위해 InputStreamReader에 연결
		Reader reader = new InputStreamReader(inputStream);
		// keyboard 입력을 1줄씩 읽어오기 위해 BufferedReader에 연결
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("내용을 입력> ");
		String text = br.readLine();
		System.out.println("입력한 내영: " + text);
		
		br.close();
	}
	
}
