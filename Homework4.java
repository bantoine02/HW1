import java.io.*;
import java.util.Arrays;
import java.util.Date;
public class Homework4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		basicArray();

		String[] strArray = new String[] { "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
				"ninth", "tenth" };
		printElements(strArray);
		System.out.println();

		int[][] values = new int[10][20];
		printElements(values); // declare method in main to print

		//String[] dateArr = new String[] {"1945 09 24","2016 04 19", "2002 03 31"};
			
	
	}

	/* Method basicArray(); 
	 * Input: No input. 
	 * Process: Gives the array variable 50
	 * elements, adds 10 to every element and prints it out. 
	 * Output: Returns to main method
	 * 
	 */
	public static void basicArray() {

		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums[i] = nums[i] + 10;
			System.out.print(nums[i] + " ");
		}
			System.out.println();
	}
	/* Method printElements(); 
	 * Input:
	 * an initialized array of String type
	 * Process: 
	 * Verifies array as string and prints the array
	 * Output: Returns to main method
	 * 
	 */
	public static void printElements(String[] strArray) {
		
		System.out.println();
		System.out.println(Arrays.toString(strArray));
			
		}

	
	/* Method printElements(); 
	 * Input:
	 * 2d arrays of ints 
	 * Process: 
	 * verifies the variable as 2D array and prints it out in organized table.
	 * Output: Returns to main method
	 * 
	 */
	public static void printElements(int[][] values) {

		for (int i = 0; i < values.length; i++) {
			for (int e = 0; e < values[i].length; e++) {
				values[i][e] = e;
				System.out.printf("%5d", values[i][e]);
			}
			System.out.println();
		}
	}
}
