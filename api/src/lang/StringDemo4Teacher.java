package lang;

import java.util.Arrays;

public class StringDemo4Teacher {

	public static void main(String[] args) {
		/* 구분 */ String text1 = "노량진1동,노량진2동,상도1동,상도2동,상도3동,상도4동,흑석동,사당1동,사당2동,사당3동,사당4동,사당5동,대방동,신대방1동,신대방2동,계";
		/* 확진 */ String text2 = "10,3,5,5,-,1,5,5,3,3,-,2,5,6,7,60";
		/* 완치 */ String text3 = "8,-,3,4,-,1,5,5,3,3,-,2,4,5,7,50";
		
		text2 = text2.replace("-", "0");
		text3 = text3.replace("-", "0");
		System.out.println("확진자: " + text2);
		System.out.println("완치자: " + text3);
		
		String[] names = text1.split(",");
		String[] arr1 = text2.split(",");
		String[] arr2 = text3.split(",");
		
		System.out.println("동이름: " + Arrays.toString(names));
		System.out.println("확진자: " + Arrays.toString(arr1));
		System.out.println("완치자: " + Arrays.toString(arr2));
		
		System.out.println("==========================================================");
		System.out.println("발생지역명\t|확진자수\t|완치자수\t|환자수");
		System.out.println("-----------------------------------------------------");

		for(int i = 0; i < names.length; i++) {
			String name = names[i];				 // 배열에서 동 이름 가져오기
			String value1 = arr1[i];			 // 배열에서 확진자수 가져오기
			String value2 = arr2[i];			 // 배열에서 완치자수 가져오기
			int num1 = Integer.parseInt(value1); // value1의 값을 Integer 클래스를 이용하여 정수로 변환
			int num2 = Integer.parseInt(value2); // value2의 값을 integer 클래스를 이용하여 정수로 변환
			int num3 = num1 - num2;				 // 확진자수 - 완치자수
			
			System.out.println(name + "\t\t | " + value1 + "\t | " + value2 + "\t | " + (Integer.parseInt(value1) - Integer.parseInt(value2)) );
			
		}
		System.out.println("==========================================================");

	}

}
