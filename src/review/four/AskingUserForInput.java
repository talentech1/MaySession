package review.four;

import java.util.Scanner;

public class AskingUserForInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userEnteredString = input.nextLine();
		
		System.out.println(userEnteredString.toUpperCase());

	}

}
