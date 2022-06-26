package homework.three;

public class QuestionSeven {

	public static void main(String[] args) {
		// Given an array String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google", }; 
		// convert all the values to UpperCase.
		String[] brands = {"Verizon", "Adidas", "BMW", "Ford", "Mazda","Exxon", "Google" };
		
		for(int i=0; i<brands.length; i++) {
			brands[i] = brands[i].toUpperCase();
			System.out.println(brands[i]);
		}
		System.out.println("------");
		
		for(int i=0; i<brands.length; i++) {
			System.out.println(brands[i]);
		}
	}

}
