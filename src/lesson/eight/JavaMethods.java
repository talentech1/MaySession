package lesson.eight;

import java.sql.Timestamp;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetByName("Talent Tech");
		greet();
		devide(6.0, 0);
		currentTime();
		greetByName("Jackson");
		greetByName(toUpperCase("Jackson"));
	}

	public static void greet() {
		System.out.println("Hello!");
	}

	public static void greetByName(String name) {
		System.out.println("Hello! " + name);
	}

	public static void devide(double a, double b) {
		System.out.println(a / b);
	}

	public static void currentTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
	}
	
	public static String toUpperCase(String s) {
		return s.toUpperCase();
	}

}
