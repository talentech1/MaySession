package quiz;

import java.util.Arrays;

public class QuizThree {

	public static void main(String[] args) {
		int[] a = { 1, 2, 11, 5, 36, 1, 21, 89, 12 };
		printSmalletNumber(a);

	}

	public static void printSmalletNumber(int[] arr) {
		int smallestNum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			int currentNumber = arr[i];
			if (currentNumber < smallestNum) {
				smallestNum = currentNumber;
			}
			System.out.println(smallestNum);
		}
		System.out.println("smallest num: " + smallestNum);
	}

	public static void getSmallestNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

	public static void getlargestNumber(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}

}
