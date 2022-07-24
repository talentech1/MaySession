package review.five;

import java.util.HashMap;

public class HashMapReview {

	public static void main(String[] args) {
		HashMap<String, String> storeHours = new HashMap<String, String>();
		storeHours.put("Monday", "9:00 AM - 8:00PM");
		storeHours.put("Tuesday", "9:00 AM - 8:00PM");
		storeHours.put("Wednesday", "9:00 AM - 8:00PM");
		storeHours.put("Thursday", "9:00 AM - 8:00PM");
		storeHours.put("Friday", "9:00 AM - 8:00PM");
		storeHours.put("Saturday", "11:00AM - 8:00PM");
		storeHours.put("Sunday", "Closed");
		System.out.println(storeHours);

	}

}
