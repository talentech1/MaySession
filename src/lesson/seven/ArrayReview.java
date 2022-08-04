package lesson.seven;

public class ArrayReview {

	public static void main(String[] args) {
		double[] prices = new double[5];
		// [0.0][0.0][0.0][0.0][0.0]
		System.out.println(prices[1]);
		prices[1] = 5.3;
		// [0.0][5.3][0.0][0.0][0.0]
		System.out.println(prices[1]);
		prices[4] = 12.99;
		// [0.0][5.3][0.0][0.0][12.99]
		System.out.println(prices[4]);
	}

}
