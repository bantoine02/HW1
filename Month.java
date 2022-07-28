
public class Month {

	private int monthNumber = (12);

	public Month() {
		monthNumber = 1;

	}

	Month(int monthNumber) {

		if (monthNumber < 1 || monthNumber > 12) {
			this.monthNumber = 1;
		}
	}

	public class monthNumberException extends Exception {

		monthNumberException(String message) {
			super(message);

		}

	}

	Month(String monthName) {
		

		if (monthName.equals("January")) {
			this.monthNumber = 1;
		} else if (monthName.equals("February")) {
			this.monthNumber = 2;
		} else if (monthName.equals("March")) {
			this.monthNumber = 3;
		} else if (monthName.equals("April")) {
			this.monthNumber = 4;
		} else if (monthName.equals("May")) {
			this.monthNumber = 5;
		} else if (monthName.equals("June")) {
			this.monthNumber = 6;
		} else if (monthName.equals("July")) {
			this.monthNumber = 7;
		} else if (monthName.equals("August")) {
			this.monthNumber = 8;
		} else if (monthName.equals("September")) {
			this.monthNumber = 9;
		} else if (monthName.equals("October")) {
			this.monthNumber = 10;
		} else if (monthName.equals("November")) {
			this.monthNumber = 11;
		} else if (monthName.equals("December")) {
			this.monthNumber = 12;
		}
	}

	public class invalidMonthException extends Exception {

		invalidMonthException(String message) {
			super(message);

		}

	}

	public void setMonthNumber(int setMonthNum) {
		this.monthNumber = setMonthNum;
		if (setMonthNum < 1 || setMonthNum > 12) {
			setMonthNum = 1;
		}
	}

	int getMonthNumber() {
		return this.monthNumber;
	}

	String getMonthName(int num) {
		
		String month = "";
		switch (num) {
		case 1:
			return month = "January";
		case 2:
			return month = "February";
		case 3:
			return month = "March";
		case 4:
			return month = "April";
		case 5:
			return month = "May";
		case 6:
			return month = "June";
		case 7:
			return month = "July";
		case 8:
			return month = "August";
		case 9:
			return month = "September";
		case 10:
			return month = "October";
		case 11:
			return month = "November";
		case 12:
			return month = "December";
		default:
			month = "Invalid Month";
		}
		return month;

	}
	public String toString() {
		return getMonthName(monthNumber);
		}
	
		public boolean equals(Object sameMonth) {

			if (sameMonth == new Month()) {

				return true;
			}
			return false;
		}
	}
