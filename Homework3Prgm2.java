import java.util.Scanner;
import java.io.*;

public class Homework3Prgm2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner kybd = new Scanner(System.in);
		PrintWriter out = new PrintWriter("HW3Prgm2.txt");

		System.out.println("Choose which shape you want to use!");
		String shape = kybd.next();
		if (shape.equals("circle")) {

			System.out.println("What is the radius of the circle?");
			int radius = kybd.nextInt();
			out.println("The radius of the circle is " + radius);

			System.out.println("Choose which shape you want to use!");
			shape = kybd.next();
		}
		if (shape.equals("square")) {

			System.out.println("What is the perimeter of the sqaure?");
			int perimeter = kybd.nextInt();
			out.println("The perimeter of the square is " + perimeter);

			System.out.println("Choose which shape you want to use!");
			shape = kybd.next();

		}

		if (shape.equals("triangle")) {

			System.out.println("What is the perimeter of the triangle?");
			int triPerimeter = kybd.nextInt();
			out.println("The perimeter of the triangle is " + triPerimeter);

		}
		// close i/o files
		kybd.close();
		out.close();

	}

}
