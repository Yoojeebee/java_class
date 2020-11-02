package formatting;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatDemo2 {
	public static void main(String[] args) throws ParseException {
		String text1 = "1,000,000";
		String text2 = "4,000,000";
		
		DecimalFormat df = new DecimalFormat("#,###");
		Number num1 = df.parse(text1);
		Number num2 = df.parse(text2);
		
		int currency1 = num1.intValue();
		int currency2 = num2.intValue();
		int totalCurrency = currency1 + currency2;
			
		System.out.printf("합계: %s\n", df.format(totalCurrency));
	}
}
