import java.text.NumberFormat;

public class Helloworld {
	
	public static void main(String[] args) {
	 
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String resultCurrency = currency.format(123456.5435);
		System.out.println(resultCurrency);
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		String resultPercent = percent.format(0.1);
		System.out.println(resultPercent);
		
		
		String shortVersion = NumberFormat.getPercentInstance().format(0.19);
		System.out.println(shortVersion);
	}
}
