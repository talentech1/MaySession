package lesson.three;

public class ContinueExample {

	public static void main(String[] args) {
		// Skip if number is euqal to 49
		for(int i = 1; i<=55; i++) {
			if(i==49) {
				continue;
			}
			System.out.println(i);
		}
	}

}
