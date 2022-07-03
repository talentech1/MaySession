package homework.four;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isOdd(6));
		System.out.println(isOdd(21));

	}
	
	public static boolean isOdd(int i) {
		if(i % 2 == 0) {
			return false;
		}else {
			return true;
		}
		
	}

}
