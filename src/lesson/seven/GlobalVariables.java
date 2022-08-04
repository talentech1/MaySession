package lesson.seven;

public class GlobalVariables {
	static String global = "I can be accessed by any methods";
	static int quantity =10;
	
	public static void main(String[] args) {
		String name = "TalentTech";
		int quantity = 50;
		System.out.println(global);
		System.out.println(quantity);
		sayHello();
	}
	
	public static void sayHello() {
		int number = 5;
		System.out.println(quantity);
	}

}
