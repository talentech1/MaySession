package lesson.five;

import java.util.HashMap;

public class HashMapLesson {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> testScores = new HashMap<Character, Integer>();
		testScores.put('A', 89);
		testScores.put('B', 35);
		testScores.put('C', 77);
		testScores.put('D', 90);
		testScores.put('E', 78);
		System.out.println(testScores);
		System.out.println(testScores.size());
		System.out.println(testScores.get('C'));
		testScores.put('C', 80);
		System.out.println(testScores);
		testScores.put('F', 90);
		System.out.println(testScores);
		
		HashMap<Character, Integer> testScoresTwo = new HashMap<Character, Integer>();
		testScoresTwo.put('A', 89);
		testScoresTwo.put('B', 35);
		testScoresTwo.put('C', 80);
		testScoresTwo.put('D', 90);
		testScoresTwo.put('E', 78);
		testScoresTwo.put('F', 90);
		
		System.out.println(testScoresTwo.equals(testScores));
		System.out.println(testScores);
		System.out.println(testScoresTwo);
		System.out.println(testScoresTwo.keySet());
		System.out.println(testScoresTwo.values());
		
		

	}
 
}
