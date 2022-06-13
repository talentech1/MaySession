package lesson.two;

public class StringsLesson {

	public static void main(String[] args) {
		String greeting = "he llo ";
		String name = "Ratan";
		
		int len = name.length();
		
		System.out.println(len);
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.trim());
		System.out.println(greeting.replace(" ", "e"));
		
		String dailyGreeting = "HI! Have a good Sunday!";
		boolean match = dailyGreeting.startsWith("Hi! Have a good");
		System.out.println(match);
		System.out.println(dailyGreeting.endsWith("!"));
		
		String a = " ";
		System.out.println(a.isEmpty());

	}

}
