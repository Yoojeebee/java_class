package io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @FileName : InputStreamDemo2.java
 * @Project : api
 * @author	:user
 * @Date	:2020. 11. 2.
 * @Time    :오전 11:07:26
 */
public class InputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		String address = "https://img9.yna.co.kr/photo/cms/2020/10/29/81/PCM20201029000181990_P4.jpg";
		
		// 지정된 주소(address)로 URL 객체 생성
		// 지정된 주소가 가리키는 리소스를 읽어올 수 있는 InputStream 구현 객체를 반환
		URL url = new URL(address);
		InputStream in = url.openStream();
		System.out.println(in);
		
		int value = 0;
		while( (value = in.read()) != -1 ) {
			System.out.println(value);
		}
		
		in.close();
	}
}
