import java.util.Scanner;

public class MonthHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int monthNum = 0;
		int year = 0;
		Month getMonth = new Month();
		MonthDays getDays = new MonthDays(monthNum, year);

		System.out.println("Enter a month (1-12): ");
		monthNum = in.nextInt();

		System.out.println("Enter a year: ");
		year = in.nextInt();

		System.out.println(getMonth.getMonthName(monthNum) + " " + year + " has "
			+ getDays.getNumberOfDays(monthNum, year) + " days.");	
		
		in.close();	
	}


}
