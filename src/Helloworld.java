import java.util.Arrays;

public class Helloworld {

	public static void main(String[] args) {
		 
		//int[][][] numbers = new int[2][3][5];
		//numbers[0][0][0] = 3;
		//System.out.println(Arrays.deepToString(numbers));
		
		int[][] numbers = { {1,2,3} , {4,5,6} };
		
		numbers[0][0] = 3;
		System.out.println(Arrays.deepToString(numbers));
		
		
	} 
}
