package review.two;

public class NumberGreaterThan {

	public static void main(String[] args) {
		//Generate a random Number
		int min = 5;
		int max = 25;
		int randomNum = (int) (Math.random()*(max-min)) + min;
		System.out.println(randomNum);
		
		if(randomNum > 15) {
			System.out.println(randomNum + " is greter than 15");
		}else {
			System.out.println(randomNum + " is less than 15");
		}

	}

}
