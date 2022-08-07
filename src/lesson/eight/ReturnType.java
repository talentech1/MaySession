package lesson.eight;

public class ReturnType {

	public static void main(String[] args) {
		int[] streets = { 120, 12, 43, 24, 77, 72, 73 };
		boolean found = searchArray(streets, 12);
		if(found) {
			System.out.println(" found my number");
		}else {
			System.out.println(" Did not find my number");
		}
	}

	public static boolean searchArray(int[] numbers, int num) {
		boolean result = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				result = true;
				break;
			}
		}

		return result;
	}

}
