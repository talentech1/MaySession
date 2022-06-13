package lesson.two;

public class IfElseProblem {

	public static void main(String[] args) {
		// 1. Declare a string with any value
		// 2. If string length is greater than 10 then print out `long word`
		// 3. If string length is less than 5 then print out `short word`
		// 4. If string length is between 5-10 then print out `medium word`
		String word = "Success";
		int length = word.length();
		
		if(length > 10) {
			System.out.println("Long Word");
		}else if(length < 5) {
			System.out.println("Short Word");
		}else {
			System.out.println("Medium Word");
		}
		
	}

}
