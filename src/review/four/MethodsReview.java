package review.four;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReview {

	public static void main(String[] args) {
		printCurrentDateTime();
		double hourlyRate = 25.00;
		int hoursWorked = 8;

		if (todayWeekDay().equals("Saturday") || todayWeekDay().equals("Sunday")) {
			System.out.println(hourlyRate * hoursWorked * 1.5);
		} else {
			System.out.println(hourlyRate * hoursWorked);
		}

	}

	public static void printCurrentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss aa");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}

	public static String todayWeekDay() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE");
		Date date = new Date();
		String day = dateFormat.format(date);
		return day;
	}

}
