package lang;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// StringBuffer sb1 = new StringBuffer();
		
		// StringBuilder 객체의 임시저장소(버퍼)에 값 추가하기
		StringBuilder sb2 = new StringBuilder();
		sb2.append("abc");
		sb2.append(1234);
		sb2.append(3.16);
		sb2.append(true);
		sb2.append('X');
			
		// 임시저장소에 저장된 값들을 문자열로 제공받기
		String finalText = sb2.toString();
		System.out.println(finalText);
		
		StringBuilder sb = new StringBuilder();
		sb.append("국어: ")
			.append(79)
			.append(", ")
			.append("수학: ")
			.append(70)
			.append(", ")
			.append("영어: ")
			.append(70);
		String finalText2 = sb.toString();
		System.out.println(finalText2);
	}

}
