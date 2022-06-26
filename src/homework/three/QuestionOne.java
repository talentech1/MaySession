package homework.three;

public class QuestionOne {

	public static void main(String[] args) {
		int[] numbers = {23, 423, 12, 598, 200, 112}; 
		int total = 0;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(total);
			total = total + numbers[i];
		}
		System.out.println(total);

	}

}
