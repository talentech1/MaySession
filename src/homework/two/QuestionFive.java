package homework.two;

public class QuestionFive {

	public static void main(String[] args) {
		// Write a program to display the multiplication table of a given integer
		int start = 13;
		int givenNumber = 11;

		while (start <= 20) {
			int result = givenNumber * start;
			System.out.println(givenNumber + "X" + start + " = " + result);
			start++;
		}

	}

}
