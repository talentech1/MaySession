package homework.four;

public class QuestionThree {

	public static void main(String[] args) {
		double[] prices = { 23.3, 34, 4.99, 56.2, 1.3 };
		double total = sumArray(prices);
		System.out.println(total);

	}

	public static double sumArray(double[] arr) {
		double total = 0.0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return total;
	}

}
