public class Helloworld {
	
	public static void main(String[] args) {
		
		int resultRound = Math.round(1.1F);
		System.out.println(resultRound);
		
		int resultCeil = (int)Math.ceil(3.1F);
		System.out.println(resultCeil);
		
		int resultFloor = (int)Math.floor(2.1F);
		System.out.println(resultFloor);
		
		int resultMax = Math.max(2, 13);
		System.out.println(resultMax);
		
		int resultMin = Math.max(2, 13);
		System.out.println(resultMin);
		
		double resultRandom = Math.random() * 100;
		System.out.println(resultRandom);
		
		int resultRandomRound = (int)Math.round(Math.random() * 100); 
		System.out.println(resultRandomRound);
		
		int resultRandomInt = (int)(Math.random() * 100); 
		System.out.println(resultRandomInt);
	}
}
