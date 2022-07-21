package lesson.five;

import java.util.HashSet;

public class FindAllUniqNumbersInArray {

	public static void main(String[] args) {
		// Find All unique numbers in an array
		double[] arrEx = { 2, 34, 23.4, 2, 33, 12, 14, 10, 2, 18, 33 };
		
		HashSet<Double>uniqarrEx = new HashSet<Double>();
		
		for(int i=0; i<arrEx.length; i++) {
			uniqarrEx.add(arrEx[i]);
		}
		
		System.out.println(uniqarrEx);
		
		
		

	}

}
