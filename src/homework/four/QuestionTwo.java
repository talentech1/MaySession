package homework.four;

public class QuestionTwo {

	public static void main(String[] args) {
		String a = "TODO Auto-generated method stub";
		System.out.println(removeVowels(a));
	}
	
	public static String removeVowels(String s) {
		s = s.replace("a", "");
		s = s.replace("e", "");
		s = s.replace("i", "");
		s = s.replace("o", "");
		s = s.replace("u", "");
		
		return s;
	}
	

}
