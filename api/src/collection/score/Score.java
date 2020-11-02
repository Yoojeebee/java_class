package collection.score;
/*
 * - Score 클래스는 학생명, 국어점수, 영어점수, 수학점수, 총점, 평균를 저장할 수 있다.
 * - Score 클래스는 기본 생성자가 있다.
 * - Score 클래스는 학생명, 국어, 영어, 수학점수를 전달받는 생성자가 있다.
 * - Score 클래스는 학생명, 국어, 영어, 수학점수를 전달받는 생성자에서 총점과 평균을 계산해서
 * - 멤버변수 총점과 평균에 저장한다. 
 * - Score 클래스는 모든 멤버변수에 대한 Getter/Setter 메소드가 있다.
   - ScoreApp 클래스에는 main 메소드가 있다.
   - Score객체를 저장할 수 있는 ArrayList 객체를 생성한다.
   - Score객체를 5개 이상 생성한다.
   - 생성된 Score객체를 ArrayList에 하나씩 저장한다.  
   - 모든 학생의 이름, 국어, 영어, 수학, 총점, 평균 점수를 출력하기
   - 전체 학생의 평균점수를 출력하기
   - 평균이 90점 이상이 학생의 이름, 국어, 영어, 수학, 총점, 평균 점수를 출력하기
   - 학생들의 국어평균점수, 영어평균점수, 수학평균점수를 출력하기
   - 전체 학생의 평균점수보다 평균이 낮은 학생들의 이름, 국어, 영어, 수학, 총점, 평균을 출력하기
 * */
public class Score {
	//멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
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
		this.total = kor + eng + math;
		this.avg = (double)total/3;
	}
	
	// 메서드
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
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
