
public class MonthDays {
	private int month;
	private int year;

	MonthDays(int month, int year) {

	}
  

	int getNumberOfDays(int month, int year) {

		int monthDays = 0;
		switch (month) {

		case 1:
			return monthDays = 31;
		case 2:
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			if (isLeapYear) {
				return monthDays = 29;

			} else {

				return monthDays = 28;
			}

		case 3:
			return monthDays = 31;
		case 4:
			return monthDays = 30;
		case 5:
			return monthDays = 31;
		case 6:
			return monthDays = 30;
		case 7:
			return monthDays = 31;
		case 8:
			return monthDays = 31;
		case 9:
			return monthDays = 30;
		case 10:
			return monthDays = 31;
		case 11:
			return monthDays = 30;
		case 12:
			return monthDays = 31;
		default:
			

			
		return monthDays;
	}
	
}
}