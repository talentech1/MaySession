package lesson.two;

public class ElleIfLesson {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a < b) {
			System.out.println(a +" is less than "+ b);
		}else if(a > b) {
			System.out.println(a + " is greater than "+ b);
		}else if(a == 10) {
			System.out.println("A is 10");
		}else if( b == 10) {
			System.out.println("B is 10");
		}
		else {
			System.out.println(a + " and "+ b+ " are equal");
		}
	}
}
