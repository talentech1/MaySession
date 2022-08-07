package lesson.eight;

public class FindAValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 4, 2, 667, 32, 535, 21 };
		
		int searchNum = 2;
		boolean isFound = false;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			if(numbers[i] == searchNum ) {
				isFound =true;
				break;
			}
			
		}
		
		System.out.println(isFound);
		

	}

}
