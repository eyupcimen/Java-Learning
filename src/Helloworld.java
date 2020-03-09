public class Helloworld {
	
	public static void main(String[] args) {
		
		// Implicit casting
		// byte > short > int > long > float > double
		
		short x = 1;
		int y = x + 2;
		
		System.out.println(y);
		
		double a = 1.1;
		double b = a + 2;
		System.out.println(b);
		
		double u = 3.1;
		double v = (int)u + 5;
		System.out.println(v);
		
		String abc = "6";
		int ax = Integer.parseInt(abc) + 3;
		System.out.println(ax);
	}
	 
	public String name() {
		return "hello world!!!!!";
	}
}
