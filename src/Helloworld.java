import java.util.Arrays;


public class Helloworld {

	public static void main(String[] args) {
		 
		
		int result = 10 / 3;
		System.out.println(result);
		
		
		double result2 = (double)10 / (double)3;
		System.out.println(result2);
		
		
		int x = 1;
		x++;
		// or this  ++x;
		System.out.println(x);
		
		System.out.println("****** part 2");
		int a = 1;
		int b = a++;
		int c = ++a;  // if put prefix,once increase value and assign value
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println("****** part 3");
		int aa = 2;
		aa *= 3;
		System.out.println(aa);
		
		
	} 
}
