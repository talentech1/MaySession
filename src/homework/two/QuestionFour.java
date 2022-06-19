package homework.two;

public class QuestionFour {
	
	public static void main(String[] args) {
		// Replace all vowels from the following string "Here’s how it works"
		String a = "Here how it works at Our workplace";
		// a,e i, o u
		
		a = a.replaceAll("a", "");
		a = a.replaceAll("e", "");
		a = a.replaceAll("i", "");
		a = a.replaceAll("o", "");
		a = a.replaceAll("u", "");
		a = a.replaceAll("A", "");
		a = a.replaceAll("E", "");
		a = a.replaceAll("I", "");
		a = a.replaceAll("O", "");
		a = a.replaceAll("U", "");
		
		System.out.println(a);
	}

}
