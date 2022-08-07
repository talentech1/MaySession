package quiz;

public class QuizFour {

	public static void main(String[] args) {
		// Write a program to calculate the average of the array below
		
		double[] numbers = {3.4, 78.9, 100.9, 50, 67.2};
		int length = numbers.length;
		double sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum+= numbers[i];
		}
		
		double average = sum/length;
		System.out.println(average);

	}

}
