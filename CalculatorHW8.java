import java.io.*;
import java.util.Scanner;

public class CalculatorHW8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char operation;
		boolean quit = true;

		File myfile = new File("CalculatorHW8Input.txt");
		Scanner inputFile = new Scanner(myfile); // inputFile is a Scanner reference variable
		// Scanner inputFile = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("CalculatorHW8.txt");
		// PrintWriter outputFile = new PrintWriter(System.out);

		
		outputFile.println("Calculator!\n");
		/*The main method allows for each part of the calculator to
		 * compute the correct equations by matching each method to 
		 * it's corresponding arithmetic operation.
		 */
		do {

			calcMenu();
			System.out.println("Select your operation: ");
			operation = inputFile.next().charAt(0);
			switch (operation) {
			
			case 'q':
			case 'Q':
				quit = false;
				break;
			case '+':
				Addition(outputFile, inputFile);
				break;
			case '-':
				Subtraction(outputFile, inputFile);
				break;
			case '*':
				Multiplication(outputFile, inputFile);
				break;
			case '/':
				Division(outputFile, inputFile);
				break;
				
				
			
		
			}
			
		} while (quit);
		outputFile.println("The calculator is done computing!");
		inputFile.close();
		outputFile.close();
	}

	/*
	 * Menu part of the calculator, allows for user to pick what operation they want
	 * to use
	 */
	public static void calcMenu() {

		System.out.println("Type +, -, *, /, or % for arthimetic operations.\n" + "Type A to find the average\n"
				+ "Type X to find the maximum\n" + "Type M to find the minimum\n" + "Type S to find the square\n"
				+ "Type Q to quit");

	}
	/*Input: numbers from input next to case (+) 
	 * Method: An equation that adds the addend and the augend to get the sum
	 * Output: Prints the answer on the output file.
	 */

	public static void Addition(PrintWriter output, Scanner input) {

		int addend, augend, sum;

		output.println("Operation: Addition\n");
		addend = input.nextInt(); 					//input
		output.println("Enter the addend: " + addend);
		augend = input.nextInt();
		output.println("Enter the augend: " + augend);

		sum = addend + augend; //process

		output.println("The sum is " + sum + "\n"); //output
	}
	/*Input: numbers from input next to case (-) 
	 * Method: An equation that subtracts the subtrahend and minuend to get the difference
	 * Output: Prints the answer on the output file.
	 */

	public static void Subtraction(PrintWriter output, Scanner input) {
		int subtrahend, minuend, difference;

		output.println("Operation: Subtraction\n"); 
		subtrahend = input.nextInt(); //input
		output.println("Enter the subtrahend: " + subtrahend);
		minuend = input.nextInt();
		output.println("Enter the minuend: " + minuend);
		difference = subtrahend - minuend; //process
		output.println("The difference is " + difference + "\n"); //output

	}
	/*Input: numbers from input next to case (*) 
	 * Method: An equation that multiplies the multiplicand by the multiplier to get the product.
	 * Output: Prints the answer on the output file.
	 */

	public static void Multiplication(PrintWriter output, Scanner input) {
		int multiplicand, multiplier, product;

		output.println("Operation: Multiplication\n"); //input
		multiplicand = input.nextInt();
		output.println("Enter the multiplicand: ");
		multiplier = input.nextInt();
		output.println("Enter the multiplier: ");

		product = multiplicand * multiplier; //process
		output.println("The product is " + product + "\n"); //output

	}
	/*Input: numbers from input next to case (/) 
	 * Method: An equation that divides the dividend and the divisor to get the quotient
	 * Output: Prints the answer on the output file.
	 */

	public static void Division(PrintWriter output, Scanner input) {
		int dividend, divisor, quotient;

		output.println("Operation: Division \n");
		dividend = input.nextInt(); 			//input
		output.println("Enter the dividend: " + dividend);
		divisor = input.nextInt();
		output.println("Enter the divisor: " + divisor);


		quotient = dividend / divisor;		 //process

		output.println("The quotient is " + quotient + "\n");		 //output

	}
	
}

