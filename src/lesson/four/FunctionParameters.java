package lesson.four;

public class FunctionParameters {

	public static void main(String[] args) {
		greet("Nate");
		greet("Jafor");
		add(99, 3);
		add(5, 8);
		multiply(3, 5);
		multiply(-1, -6);
		intro("Jafor", 18, "NYC");
		
		String[] names = {"Nate", "Raton", "Munshi"};
		for(int i=0; i<names.length; i++) {
			greet(names[i]);
		}

	}

	public static void greet(String name) {
		System.out.println("Hi " + name + "!");
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void intro(String name, int age, String city ) {
		System.out.println("Hi my name is "+ name +
				" ,and I am from "+city +". I am " + age + " old");
	}

}
