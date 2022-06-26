package lesson.four;

import java.util.ArrayList;

public class ArrayListExampleTwo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers.isEmpty());
		numbers.add(12);
		numbers.add(122);
		numbers.add(20);
		numbers.add(18);
		System.out.println(numbers.isEmpty());
		boolean result = numbers.contains(3);
		
		System.out.println(result);
		
		System.out.println(numbers);
		System.out.println(numbers.get(3));
		numbers.set(3, 30);
		System.out.println(numbers);

	}

}
