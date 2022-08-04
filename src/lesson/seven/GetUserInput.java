package lesson.seven;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a numer");
		byte number = myScanner.nextByte();
		System.out.println("------------");
		System.out.println(number * 2);

	}

}
