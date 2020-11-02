package formatting;

public class NumberParse {
	public static void main(String[] args) {
		String text1 = "10,000,000";
		String text2 = "4,000,000";
		
		text1 = text1.replace(",","");
		text2 = text2.replace(",","");
		
		int num1 = Integer.parseInt(text1);
		int num2 = Integer.parseInt(text2);
		
		int total = num1 + num2;
		System.out.println("합계: " + total);
	}
}
