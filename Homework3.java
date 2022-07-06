import java.io.*;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n;

		File myfile = new File("Homework3In.txt");
		Scanner in = new Scanner(myfile);
		// Scanner inputFile = new Scanner(System.in);
		PrintWriter out = new PrintWriter("Hoemwork3Out.txt");
		// PrintWriter outputFile = new PrintWriter(System.out);

		while (in.hasNext()) {

			n = in.nextInt();
			// methods
			FactorMethod(n, out);
			SumofSquares(n, out);
			FiboSeqMethod(n,out);
		}
		//close i/o files
		in.close();
		out.close();

	}
	/*Method FactorMethod();
	 * Input:
	 * n = reference to initialized int variable
	 * out = reference to output file
	 * Process:
	 * Takes one number from input file and finds the factorial value for that number
	 * Output:
	 * Returns to main method
	 * 
	 */
	public static void FactorMethod(int n, PrintWriter out) {

		int factorialValue = 1;
		if (n == 6) {
			for (int i = 1; i <= n; i++) {

				factorialValue *= i;

			}
			out.println("The factorial of " + n + " is " + factorialValue);

		}

	}
	/*Method SumofSquares();
	 * Input:
	 * n = reference to initialized int variable
	 * out = reference to output file
	 * Process:
	 * Takes one number from input file and finds the sum of squares
	 * Output:
	 * Returns to main method
	 * 
	 */
	public static void SumofSquares(int n, PrintWriter out) {

		int sumOfSqaures = 0;

		if (n == 10) {
			for (int i = 1; i <= n; i++) {

				sumOfSqaures = (n * (n + 1) * (2 * n + 1)) / 6;
		
			}

			out.println("The sum of squares is " + sumOfSqaures);

		}

	}
	/*Method FiboSeqMethod();
	 * Input:
	 * n = reference to initialized int variable
	 * out = reference to output file
	 * Process:
	 * Takes number from input file and uses it to do the Fibonacci sequence
	 * Output:
	 * Returns to main method
	 * 
	 */
	public static void FiboSeqMethod(int n, PrintWriter out) {

		int i1 = 1;
		int i2 = 2;
		int i3;
		
		if (n == 26) {
			out.print(i1 + " " + i2);
			for (int i = 3; i < n; ++i) {
				i3 = i1 + i2;
				out.print(" " + i3);
				i1 = i2;
				i2 = i3;

			}

		}

	}

}
