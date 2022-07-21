package lesson.five;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetLesson {

	public static void main(String[] args) {
		double[] arrEx = { 2, 34, 23.4, 2, 33, 12, 14, 10, 2, 18 };
		
		ArrayList<Double> numberList = new ArrayList<Double>();
		System.out.println(numberList.size());
		numberList.add(2.0);
		numberList.add(34.0);
		numberList.add(23.4);
		numberList.add(2.0);
		numberList.add(33.0);
		numberList.add(12.0);
		numberList.add(14.0);
		numberList.add(10.0);
		numberList.add(2.0);
		numberList.add(18.0);
		System.out.println(numberList.size());
		System.out.println(numberList);
		
		System.out.println("---------------------");
		
		HashSet<Double> numberSet = new HashSet<Double>();
		numberSet.add(2.0);
		numberSet.add(34.0);
		numberSet.add(23.0);
		System.out.println(numberSet.size());
		System.out.println(numberSet);
		numberSet.add(2.0);
		numberSet.add(23.0);
		System.out.println(numberSet.size());
		System.out.println(numberSet);

	}

}
