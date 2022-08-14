package lesson.nine;

public class DvdPlayer extends Electronics {
	String color;
	String[] outputs;

	public DvdPlayer(String brand, double weight, int price, String color, String[] outputs) {
		super(brand, weight, price);
		this.color = color;
		this.outputs = outputs;
	}
	
	public void sell() {
		System.out.println("Sold a DVDplayer!!!!");
		this.sold = true;
	}

}
