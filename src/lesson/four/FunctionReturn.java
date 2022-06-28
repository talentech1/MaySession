package lesson.four;

public class FunctionReturn {

	public static void main(String[] args) {
		System.out.println(multiply(3,add(5,3)));
		System.out.println(add(3, multiply(5,3)));
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	


}
