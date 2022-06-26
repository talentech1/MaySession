package lesson.four;

import java.util.ArrayList; 

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); 
		
		cars.add("BmW");
		cars.add("Honda");
		System.out.println(cars);
		System.out.println(cars.size());
		cars.remove(0);
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		System.out.println(cars.size());

	}

}
