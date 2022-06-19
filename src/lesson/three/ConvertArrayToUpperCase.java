package lesson.three;

public class ConvertArrayToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "tesla";
		System.out.println(a.toUpperCase());
		
		String[] cars = {"Acura", "HOnda", "toyota", "lexus"};
		
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i].toUpperCase());
		}
	}

}
