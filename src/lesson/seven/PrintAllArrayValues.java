package lesson.seven;

public class PrintAllArrayValues {

	public static void main(String[] args) {
		String[] brands = { "Apple", "Samsung", "Vizio", "HP", "Amazon" };
		for (int i = 0; i <= 4; i++) {
			System.out.println(brands[i]);
		}

		System.out.println("--------");
		for (int i = 4; i >=0; i--) {
			System.out.println(brands[i]);
		}

	}

}
