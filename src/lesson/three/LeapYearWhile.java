package lesson.three;

public class LeapYearWhile {

	public static void main(String[] args) {
		// Print all leap year from 1806
		int min = 5;
		int max = 25;
		int startYear = (int) (Math.random()*(max-min)) + min;
		do {
			if (startYear % 4 == 0) {
				System.out.println(startYear);
			}
			startYear = startYear + 1;
		} while (startYear <= 2024);

	}

}
