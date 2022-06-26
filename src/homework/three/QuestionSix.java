package homework.three;

public class QuestionSix {

	public static void main(String[] args) {
		// Given an array String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google", }; 
		// remove any brand that has more than 5 characters.
		
		String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google" };
		for(int i=0; i<brands.length; i++) {
			if(brands[i].length() > 5) {
				System.out.println(brands[i]);
				brands[i] = "";
			}
		}

	}

}
