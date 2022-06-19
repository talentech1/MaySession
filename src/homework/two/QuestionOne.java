package homework.two;

public class QuestionOne {

	public static void main(String[] args) {
		int number = (int)(Math.random()* 50);
		
		if(number % 2 == 0) {
			System.out.println(number + " is even");
		}else {
			System.out.println(number + " is odd");
		}

	}

}
