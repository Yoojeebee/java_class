package hello;

public class HelloWorld2 {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 40, 50, 60};
		
		// 정적변수(out)은 글자가 누운 모습
		for(int num : numbers) {
			System.out.println(num);
		}
	}
}
