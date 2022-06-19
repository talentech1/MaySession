package lesson.three;

public class ForLoopExample {

	public static void main(String[] args) {
		// From 1 to 100 print every number that is devidable by 3 and 5
		for(int i =1; i <=100; i++) {
			if(i%3 == 0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}
