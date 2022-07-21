package lesson.five;

public class ChaildClass extends ParentClass {
	
	static String address = "123 75th Street";

	public static void main(String[] args) {
		System.out.println(name);
		name = "Mahir";
		printGreeting("Raton");
		System.out.println(day);
		
		HashMapLesson hml = new HashMapLesson();
		HashMapLesson hml2 = new HashMapLesson();
		hml.main(args);
		hml2.main(args);
		
	}

}
