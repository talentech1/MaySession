package homework.three;

public class QuestionThree {

	public static void main(String[] args) {
		// Given an array, int[] numbers = {23, 423, 12, 598, 200, 112};
		// find if the array includes the number 200
		
		int a = 200;
		
		int[] numbers = {200, 23, 423, 12, 598, 200, 112};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			if(numbers[i] == a) {
				System.out.println("Array includes " + a);
				break;
			}
			
		}
		
		

	}

}
