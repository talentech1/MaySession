package quiz;

public class QuizTwo {

	public static void main(String[] args) {
		// Print all numbers between 1 and 1000 that are devideable by 4 and 7
		int start = 1;
		while(start <=1000) {
			if(start % 4 == 0 && start % 7 ==0) {
				System.out.println(start);
			}
			
			start = start +1;
		}
		
	}

}
