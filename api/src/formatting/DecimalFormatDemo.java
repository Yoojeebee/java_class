package formatting;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		int number1 = 10000;
		DecimalFormat df1 = new DecimalFormat("###,###");
		String text1 = df1.format(number1);
		System.out.println(text1);
		
		DecimalFormat df2 = new DecimalFormat("000,000");
		String text2 = df2.format(number1);
		System.out.println(text2);
		
		double number2 = 12.36;
		DecimalFormat df3 = new DecimalFormat("#,###.0");
		String text3 = df3.format(number2);
		System.out.println(text3);
		
		DecimalFormat df4 = new DecimalFormat("#,###.###");
		String text4 = df4.format(number2);
		System.out.println(text4);
		
		DecimalFormat df5 = new DecimalFormat("#,###.000");
		String text5 = df5.format(number2);
		System.out.println(text5);
	}
}
