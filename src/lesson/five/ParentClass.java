package lesson.five;

public class ParentClass extends GrandFatherClass{

	static String name = "TelentTech";
	static double[] exampleArr = { 2, 34, 23.4, 2, 33, 12, 14, 10, 2, 18, 33 };
	
	public static void printGreeting(String studentName) {
		System.out.println("Hello "+ studentName +"! Welcome to "+ name);
	}

}
