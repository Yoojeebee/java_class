package lang;

public class StringDemo4 {
	public static void main(String[] args) {
		/* 구분 */ String text1 = "노량진1동,노량진2동,상도1동,상도2동,상도3동,상도4동,흑석동,사당1동,사당2동,사당3동,사당4동,사당5동,대방동,신대방1동,신대방2동,계";
		/* 확진 */ String text2 = "10,3,5,5,-,1,5,5,3,3,-,2,5,6,7,60";
		/* 완치 */ String text3 = "8,-,3,4,-,1,5,5,3,3,-,2,4,5,7,50";
		
		// 동별로 치료중인 사람 숫자 확인
		// 1. text2, text3의 - 를 0으로 변경
		// 2. text1, text2, text3를 각각 String,의 split(구분자)를 사용해서 String[] 배열로 얻는다
		// 3. 배열의 길이만큼 반복 시작
		//			i번째 동이름 꺼내기
		//			i번째 확진자수 가져오기 : "10" -> 10 으로 변환
		//			i번째 완치자수 가져오기 : "8" -> 8 로 변환
		//			치료중인 환자수 구하기
		//			동이름과 환자수 출력하기
		// 4. 반복종료
		
		// 1번에서는 replace 메서드
		// 2번에서는 split 메서드
		// 3. 반복문내의 숫자로 변환하기는 Integer.parseInt() 사용
		
		// String[] 배열에 구분, 확진, 완치자수를 초기화
		
		String confirm_ex = text2.replace("-", "0");
		String complete_ex = text3.replace("-", "0");
		
		String[] dong = text1.split(",");
		String[] confirm = confirm_ex.split(",");
		String[] complete = complete_ex.split(",");

		for(int i = 0; i < dong.length-1; i++) {
			System.out.printf("구분 : %-5s / 확진자: %3d / 완치자: %3d / 치료중: %3d\n",
								dong[i], Integer.parseInt(confirm[i]), Integer.parseInt(complete[i]),
								Integer.parseInt(confirm[i]) - Integer.parseInt(complete[i]));
		}
		
	}
}
