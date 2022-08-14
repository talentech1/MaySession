package lesson.nine;

public class Store {

	public static void main(String[] args) {
		Laptop laptopFour = new Laptop("DELL", 5, 700, 15, "Windows", 512);
		
		Electronics laptopFive = new Laptop("LG", 6, 1700, 13, "Windows", 512); 

		
		String[] outputs = { "HDMI", "MP4", "Analog" };
		DvdPlayer dvdPlayer = new DvdPlayer("Lg", 6, 300, "silver", outputs);
		dvdPlayer.sell();
		laptopFive.sell();
		System.out.println(dvdPlayer.sold);
		System.out.println(laptopFive.sold);
	}

}
