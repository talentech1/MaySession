package lesson.three;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {23, 423, 12, 598, 200, 112};
	
		
		String[] brands = {"Apple", "Microsoft", "Sony", "hp", "IBM"};
			
		for(int index = 0; index<brands.length; index++) {
			System.out.println(brands[index]);
		}
		
		System.out.println("------------");
		brands[1] = "Lenovo";
		
		for(int index = 0; index<brands.length; index++) {
			System.out.println(brands[index]);
		}
		
		
		
		
		
	}

}
