package lesson.seven;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a day");
		String day = input.nextLine();

		if (day.equals("Sunday")) {
			System.out.println("We Have Class Today");
		} else if (day.equals("Saturday")) {
			System.out.println("We Have Class Today");
		} else {
			System.out.println("We don't have Class Today");
		}

	}

}
