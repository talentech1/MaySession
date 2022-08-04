package lesson.seven;

import java.util.Scanner;

public class IfElseLogicalOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a day");
		String day = input.nextLine();
		
		if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
			System.out.println("We have class today");
		}else if(day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Friday")) {
			System.out.println("NO class today");
		}else {
			System.out.println("Invalid day");
		}

	}

}
