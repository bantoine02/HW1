
import java.io.*;			//for file i/o

public class hw_2 {
	
	public static void main(String[] args)  throws IOException
		{	
		// TODO Auto-generated method stub

		//variables
		double x, y;
		
	// create PrinterWriter reference
	PrintWriter myOutput = new PrintWriter("homework2.txt");
	//PrintWriter myOutput = new PrintWriter(System.out);
		
		
	//table headings
		myOutput.println("\t\t Table of Function Values");
		myOutput.println();
		myOutput.println("\tX Value \t Y Value \t Status\t\n");
		for(x = -3; x <= 4; x = x + .50)
		{
	//formula
		y = (9*x*x*x - 27*x*x- 4*x+ 12)/
				(Math.sqrt((3*(x*x) + 1)) + Math.abs((5-x*x*x*x)));
		myOutput.printf("%13.2f%18.3f",x,y);
		
		if (y == 0)
			myOutput.println("\t\tY IS ZERO");
		if (y < 0)
			myOutput.println("\t\tY IS NEGATIVE");
		if (y > 0)
			myOutput.println("\t\tY IS POSITIVE");
		myOutput.println();
		
		myOutput.println("\n \t\tThe table is finished!");
		
		//flush output buffer
		myOutput.flush();
		
		//close file
		myOutput.close();
		}
	}	
}