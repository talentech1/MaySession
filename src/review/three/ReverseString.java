package review.three;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Today is Thursday";
		System.out.println(a.length());	
		
		for(int i=a.length()-1; i>=0; i-- ) {
			System.out.print(a.charAt(i));
		}

	}

}
