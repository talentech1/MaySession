package review.two;

public class RemoveLettersFromString {

	public static void main(String[] args) {
		String a = "This repository is public and visible to anyone.";
		System.out.println(a.replaceAll("i", "X"));
		a = a.replaceAll("i", "X");
		System.out.println(a);

	}

}
