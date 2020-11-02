package collection.map.school;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class ScoreApp {

	public static void main(String[] args) {
		ArrayList<Score> scores = new ArrayList<>();
		scores.add(new Score("홍길동", 10, 20, 30));
		scores.add(new Score("김유신", 90, 90, 90));
		scores.add(new Score("강감찬", 20, 80, 30));
		scores.add(new Score("정약용", 90, 30, 60));
		scores.add(new Score("이순신", 10, 80, 80));
		scores.add(new Score("을용타", 30, 70, 80));
		scores.add(new Score("김남일", 20, 60, 90));
		scores.add(new Score("손흥민", 90, 80, 90));
		scores.add(new Score("이성길", 90, 100, 80));
		scores.add(new Score("히딩크", 50, 80, 80));
		
		// 학생 성적을 출력하기 위한 StringBuilder
		StringBuilder sb = new StringBuilder();

		// 1. 모든 성적정보 출력
		System.out.println("##### 학생 성적표");
		System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\t\n");
		System.out.println("----------------------------------------------------");
		for(Score score : scores) {
			sb.append(score.getName()).append("\t")
				.append(score.getKor()).append("\t")
				.append(score.getEng()).append("\t")
				.append(score.getMath()).append("\t")
				.append(score.getTotal()).append("\t")
				.append(Math.round(score.getAvg())).append("\t")
				.append(score.getGrade()).append("\t");
			System.out.println(sb);
			sb.setLength(0); // StringBuilder 객체의 내용 초기화
		}
		System.out.println();

		// 2. 학점별 인워수를 A학점부터 F학점 순으로 출력
		System.out.println("##### 학점별 학생 수");
		System.out.println("학점\t학생 수");
		TreeMap<String, Integer> lankList = new TreeMap<String, Integer>();

		// for문을 이용하여 학점별 인원을 입력
		for (Score lank : scores) {
			String grade = lank.getGrade();
			if (!lankList.containsKey(grade)) {
				lankList.put(grade, 1);
			}
			// 존재하면 
			else {
				int num = lankList.get(grade) + 1;
				lankList.put(grade, num);
			}
		}

		Set<String> key1 = lankList.keySet();
		for(String key : key1) {
			System.out.println(key + "\t" + lankList.get(key));
		}
		System.out.println();
		
		// 3. 학점별 학생들 정보 출력
		System.out.println("##### 학점별 학생 정보");
		TreeMap<String, ArrayList<Score>> sort = new TreeMap<String, ArrayList<Score>>();
		sort.put("A", new ArrayList<Score>());
		sort.put("B", new ArrayList<Score>());
		sort.put("C", new ArrayList<Score>());
		sort.put("D", new ArrayList<Score>());
		sort.put("F", new ArrayList<Score>());
		
		for(Score score : scores) {
			String grade = score.getGrade();
			ArrayList<Score> scoreList = sort.get(grade);
			scoreList.add(score);
		}
		
		Set<String> key2 = sort.keySet();
		for(String key : key2) {
			System.out.println("[" + key + "] 학점 성적 리스트");
			ArrayList<Score> scoreList = sort.get(key);
			System.out.printf("\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t\n");
			System.out.println("\t----------------------------------------------------");
			for(Score score : scoreList) {
				sb.append("\t").append(score.getName()).append("\t")
					.append(score.getKor()).append("\t")
					.append(score.getEng()).append("\t")
					.append(score.getMath()).append("\t")
					.append(score.getTotal()).append("\t")
					.append(Math.round(score.getAvg())).append("\t")
					.append(score.getGrade()).append("\t");
				System.out.println(sb);
				sb.setLength(0); // StringBuilder 객체의 내용 초기화
			}
			System.out.println();
		}
	}

}
