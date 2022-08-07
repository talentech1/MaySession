package lesson.eight;

public class FindAllEvenNumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 2, 667, 32, 535, 21 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				continue;
			}
			System.out.println(numbers[i]);
		}

	}

}
