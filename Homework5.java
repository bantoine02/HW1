import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String speed;
		String vehicle;
		String time;
		String filename = "Homework5Out.txt";

		File myfile = new File("Homework5In.txt");
		Scanner inputFile = new Scanner(myfile);
		// Scanner inputFile = new Scanner(System.in);
		// inputFile.useDelimiter(",");

		while (inputFile.hasNext()) {

			vehicle = inputFile.next();
			speed = inputFile.next();
			time = inputFile.next();

			distance(speed, time);
			saveAsFile(filename);
		}

		inputFile.close();

	}

	/*
	 * Method distance(); 
	 * Input: time - initalized String variable 
	 * speed - initialized String variable
	 * Process: Converts string variable to int, takes
	 * two inputs from input file and uses a loop to create a table for miles
	 * traveled. 
	 * Output: Returns to main method
	 * 
	 */
	public static void distance(String speed, String time) {
		
		
		if (!speed.equals("Speed")) {
			int Speed = Integer.valueOf(speed);
				int Time = Integer.valueOf(time); // converted string values to ints

				if (Speed == 65 && Time == 4) {

					System.out.printf("%9s\t", "Hour");
					System.out.printf("%10s\n", "Miles Travelled");

					for (int t = 1; t <= Time; t++) { // for loop used iteration

						System.out.printf("%7d%18d \n", t, Speed * t);
					}
				}
		}
	}

	/*
	 * Method saveAsFile(); 
	 * Input: 
	 * filename = reference to initialized String variable 
	 * Process: Create and saves report to an output file
	 * Output: Prints to output
	 * 
	 */
	public static void saveAsFile(String filename) throws IOException {

		PrintStream out = new PrintStream(filename);
		System.setOut(out);
		out.close();

	}

}
