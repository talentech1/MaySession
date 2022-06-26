package homework.three;

public class QuestionFour {

	public static void main(String[] args) {
		// Given an array int[] intArray2 = { 61, 17, 58, 39, 10 };
		// find the average of all the values
		
		int[] intArray2 = { 61, 17, 58, 39, 12 };
		double sum = 0;
		for(int i=0; i<intArray2.length; i++) {
			sum+= intArray2[i];
		}
		double average = sum / intArray2.length;
		System.out.println(average);
		

	}

}
