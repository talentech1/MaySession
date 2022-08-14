package lesson.nine;

public class ForloopsReview {

	public static void main(String[] args) {
		
		String[] names = {"Raton", "Nahin", "Zia", "Mahir", "Sharmin", "Shakil"};
		
		for(int i= 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		for(String item : names) {
		    System.out.println(item);
		    if(item.equals("Mahir")) {
		    	break;
		    }
		}

	}

}
