package collection.score;

import java.util.ArrayList;
public class ScoreApp {

	public static void main(String[] args) {
		ArrayList<Score> score = new ArrayList<>();
		
		Score student1 = new Score("홍길동", 10, 20, 30);
		Score student2 = new Score("김유신", 90, 90, 90);
		Score student3 = new Score("강감찬", 20, 80, 30);
		Score student4 = new Score("정약용", 90, 30, 60);
		Score student5 = new Score("이순신", 10, 80, 80);
		Score student6 = new Score("을용타", 30, 70, 80);
		Score student7 = new Score("김남일", 20, 60, 90);
		Score student8 = new Score("손흥민", 90, 80, 90);
		Score student9 = new Score("이성길", 90, 100, 80);
		Score student10 = new Score("히딩크", 50, 80, 80);
		
		score.add(student1);
		score.add(student2);
		score.add(student3);
		score.add(student4);
		score.add(student5);
		score.add(student6);
		score.add(student7);
		score.add(student8);
		score.add(student9);
		score.add(student10);
		
		// ArrayList의 객체에 저장되어 있는 Score 클래스의 객체 수
		int size = score.size();
		
		// 각 과목의 평균 점수
		double korAvg = 0.0;
		double engAvg = 0.0;
		double mathAvg = 0.0;
		
		// 학년 평균점수(국어, 수학, 영어의 도합 점수 / 학생 수)
		double totalAvg = 0.0;
		
		// 1. 모든 성적정보 출력
		System.out.println("##### 학생 성적표");
		for(Score student : score) {
			System.out.printf("이름: %s / 국어: %d / 영어: %d / 수학: %d / 총점: %d / 평균: %.2f / 학점: %s\n"
					, student.getName(), student.getKor(), student.getEng(), student.getMath()
					, student.getTotal(), student.getAvg());
		}
		System.out.println();
		
		// 2. 평균 90점이 넘는 학생 출력
		System.out.println("##### 평균 90점 이상 학생");
		for(Score student : score) {
			if(student.getAvg() >= 90) {
				System.out.printf("이름: %s / 국어: %d / 영어: %d / 수학: %d / 총점: %d / 평균: %.2f / 학점: %s\n"
					, student.getName(), student.getKor(), student.getEng(), student.getMath()
					, student.getTotal(), student.getAvg());
			}
		}
		System.out.println();
		
		// 3. 학년 국어, 영어, 수학 점수 평균 구하기
		System.out.println("##### 학생들의 국어, 영어, 수학 평균점수 구하기");
		for(Score student : score) {
			korAvg += student.getKor();
			engAvg += student.getEng();
			mathAvg += student.getMath();
		}
		korAvg = korAvg/size;	// 학년 국어 평균점수
		engAvg = engAvg/size;	// 학년 영어 평균점수
		mathAvg = mathAvg/size;	// 학년 수학 평균점수
		System.out.printf("국어 표균점수: %.2f / 영어 표균점수: %.2f / 수학 표균점수: %.2f\n",
				korAvg, engAvg, mathAvg);
		System.out.println();
		
		// 3. 학년 평균점수보다 낮은 학생 구하기
		System.out.println("##### 학년 평균점수보다 낮은 학생");
		for(Score student : score) {
			totalAvg += student.getAvg();
		}
		totalAvg = totalAvg/size;
		System.out.println("##### 학년 평균점수: " + totalAvg);
		for(Score student : score) {
			if(totalAvg > student.getAvg()) {
				System.out.printf("이름: %s / 국어: %d / 영어: %d / 수학: %d / 총점: %d / 평균: %.2f / 학점: %s\n"
						, student.getName(), student.getKor(), student.getEng(), student.getMath()
						, student.getTotal(), student.getAvg());
			}
		}
	}

}
