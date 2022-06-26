package homework.three;

import java.util.Arrays;

public class QuestionNine {

	public static void main(String[] args) {
		// Given an array int[] intArray2 = { 61, 17, 58, 39, 10 };
		// print the values in order ex. 10, 17,39...
		int[] intArray2 = { 61, 17, 58, 39, 10 };
		Arrays.sort(intArray2);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

	}

}
