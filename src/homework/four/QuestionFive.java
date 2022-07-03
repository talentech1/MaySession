package homework.four;

public class QuestionFive {

	public static void main(String[] args) {
		System.out.println(isPrime(-11));

	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		
		for(int devider=2; devider<number; devider++) {
			System.out.println(devider);
			if(number %devider == 0) {
				return false;
			}
		}
		
		return true;
	}

}
