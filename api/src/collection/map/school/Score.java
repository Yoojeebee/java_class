package collection.map.school;

public class Score {
	// 멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;

	// 생성자
	public Score() {
		super();
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 메서드
	public String getGrade() {
		int avg = (int)getAvg();
		if (90 <= avg) {
			return "A";
		} else if (80 <= avg && avg < 90) {
			return "B";
		} else if (70 <= avg && avg < 80) {
			return "C";
		} else if (60 <= avg && avg < 70) {
			return "D";
		} else {
			return "F";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (double)getTotal() / 3;
	}

}
