package lang;

public class StringDemo {
	public static void main(String[] args) {
		// 문자열 길이 조회
		// int length() -> 변수명.length() -> 반환타입 : int
		String str = "가나다라마바사";
		int len = str.length();
		
		System.out.println("문자열 길이: " + len);
		
		/* 문자열이 동일한 내용인지 확인하기
		 * 		equals(String string) -> 변수명.equals(string : String) -> 반환타입 : boolean
		 * 		문자열의 대소문자 상관없이 같은 내용인지 확인하기
		 *  	equalsIgnoreCase(string : String) -> 반환타입 : boolean
		 */
		String str2 = "hello";
		String str3 = "Hello";
		String str4 = "hello";
		
		boolean result1 = str2.equals(str3);
		boolean result2 = str2.equals(str4);
		boolean result3 = str2.equalsIgnoreCase(str3);
		
		System.out.println("str2와 str3: " + result1); // false
		System.out.println("str2와 str4: " + result2); // true
		System.out.println("str2와 str3: " + result3); // true
		
		// 빈 문자열인지 확인(문자열의 길이 확인)
		// isEmpty() -> 반환타입 : boolean
		String str5 = "";
		String str6 = " ";
		System.out.println("str5는 빈 문자열 인가? " + str5.isEmpty()); // true
		System.out.println("str5는 빈 문자열 인가? " + str6.isEmpty()); // true
		
		/* 부분 문자열 획득하기
		 * 		1.지정된 시작위치부터 문자열의 끝에 해당하는 부분가지 획득
		 * 		subString(int beginIndex) -> 반환타입 : String -> 0번째 자리부터 숫자가 시작된다
		 * 		
		 * 		2.지정된 시작위치 ~ 끝위치 범위에 해당하는 부분까지 반환
		 * 		endIndex에 해당하는 문자는 반환하지 않는다
		 * 		subString(int beginIndex, int endIndex) -> 반환타입 : String
		 */
		String str7 = "가나다라마바사아자카타파하";
		String result6 = str7.substring(3);
		String result7 = str7.substring(3, 8);
		
		// 가(0) 나(1) 다(2) ... 파(10), 하(11)
		System.out.println("부분문자열: " + result6);
		System.out.println("부분문자열: " + result7);
	
		// 대소문자로 변환된 문자열 반환
		// toUpperCase() -> 반환타입 : String
		// toLowerCase() -> 반환타입 : String
		String str8 = "My car is Genesis";
		String result8 = str.toUpperCase();
		String result9 = str.toLowerCase();
		
		System.out.println("대문자: " + result8);
		System.out.println("소문자: " + result9);
		System.out.println("원본: " + str8);
		
		// 문자열에서 특정한 문자열이 다른 문자열로 대체된 문자열 반환
		// replace(CharSequence old, CharSequence new) -> 반환타입 : String
		String str9 = "나는 자바학원에서 자바를 배우고 있습니다.";
		String result10 = str9.replace("자바", "파이썬");
		System.out.println("변경된 문자열: " + result10);
		System.out.println("원본 문자열: " + str9);
		
		// 문자열을 지정된 구분문자열로 나눠서 배열로 반환
		// split(String delim) -> 반환타입 : String
		String str10 = "노량진1동,노량진2동,상도1동,상도2동,상도3동,상도4동,흑석동,사당1동,사당2동,사당3동,사당4동,사당5동,대방동,신대방1동,신대방2동,계";
		String str11 = "10,3,5,5,-,1,5,5,3,3,-,2,5,6,7,60";
		
		String[] dongNames = str10.split(",");
		String[] numbers = str11.split(",");
		
		for(int i = 0; i < dongNames.length; i++) {
			String name = dongNames[i];
			String count = numbers[i];
			System.out.println(name + ": " + count);
		}
		
		// 문자열의 불필요한 공백이 제거된 문자열을 반환
		// trim() -> 반환타입 : String
		String str12 = "               안녕하세요                  고객님";
		String result11 = str12.trim();
		System.out.println("공백이 제거된 문자열: [" + result11 + "]");
		System.out.println("원본 문자열: [" + str12 + "]");
		
		// 문자열에 특정한 글자가 포함되어 있는지를 반환
		// contains(String text) -> 반환타입 : boolean
		// 문자열이 특정한 글자로 시작되었는지 여부를 반환
		// startsWith(String text) -> 반환타입 : boolean
		// 문자열이 특정한 글자로 끝나는지 여부를 반환
		// endsWith(String text) -> 반환타입 : boolean
		// 문자열에서 특정한 글자들이 처음으로 등장하는 위치를 반환
		// int indexOf(String text) -> 반환타입: int
		// 문자열에서 특정한 글자들이 맨 마지막으로 등장하는 위치를 반환
		// int lastIndexOf(String text) -> 반환타입 : int
		String str13 = "나는 자바학원에서 자바를 배우고 있습니다.";
		boolean result12 = str13.contains("자바");
		System.out.println("글자가 포함되어 있는가? " + result12);
		int result13 = str13.indexOf("자바");
		int result14 = str13.lastIndexOf("자바");
		System.out.println("글자가 처음으로 등장하는 위치: " + result13);
		System.out.println("글자가 마지막으로 등장하는 위치: " + result14);
		
		String str14 = "이력서_홍길동.hwp";
		String str15 = "강감찬_이력서.doc";
		boolean result15 = str14.startsWith("이력서");
		boolean result16 = str15.startsWith("이력서");
		boolean result17 = str14.endsWith("hwp");
		boolean result18 = str15.endsWith("hwp");
		
		System.out.println("이력서로 시작하는가? " + result15);
		System.out.println("이력서로 시작하는가? " + result16);
		System.out.println("hwp로 시작하는가? " + result17);
		System.out.println("hwp로 시작하는가? " + result18);
		
		// 다양한 값들을 문자열로 변환해서 반환
		// static valueOf(다양한 값) -> 반환타입 : String
		String result19 = String.valueOf(12345);
		System.out.println(result19); // 12345 -> "12345"
		
		String result20 = String.valueOf(true);
		System.out.println(result20); // true -> "true"
		
		// String은 문자열의 내용이 동일하면
		// 동일한 해시코드값이 반환되도록 Object의 hashcode()를
		// 재정의한다.
		String text1 = new String("abc");
		String text2 = new String("abc");
		System.out.println(text1.hashCode());
		System.out.println(text2.hashCode());
	}
}
