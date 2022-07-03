package homework.four;

public class QuestionFour {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 12, 21, 31, 2 };
		int[] b = { 4, 2, 6, 71, 9, 0, 12 };

		int[] mergedArray = combineArray(a, b);

		for (int num : mergedArray) {
			System.out.println(num);
		}
	}

	public static int[] combineArray(int[] arrOne, int[] arrTwo) {
		int newLength = arrOne.length + arrTwo.length;
		int[] newArray = new int[newLength];
		int newArrayIndex = 0;

		for (int i = 0; i < arrOne.length; i++) {
			newArray[newArrayIndex] = arrOne[i];
			newArrayIndex++;
		}

		for (int i = 0; i < arrTwo.length; i++) {
			newArray[newArrayIndex] = arrTwo[i];
			newArrayIndex++;
		}

		return newArray;
	}

}
