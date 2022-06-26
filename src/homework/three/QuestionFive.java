package homework.three;

public class QuestionFive {

	public static void main(String[] args) {
		// Given an array int[] intArray2 = { 61, 17, 58, 39, 10 }; 
		// find the largest values in the array
		int[] intArray2 = { 61, 17, 58, 77, 39, 10 }; 
		int max = intArray2[0];
		
		for(int i = 0; i<intArray2.length; i++) {
			if(intArray2[i] > max) {
				max = intArray2[i];
			}
		}
		System.out.println(max);
		

	}

}
