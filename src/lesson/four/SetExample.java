package lesson.four;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> cars = new HashSet<String> (); 
		cars.add("bmw");
		cars.add("acura");
		cars.add("toyota");
		cars.add("BMW");
		System.out.println(cars);

	}

}
