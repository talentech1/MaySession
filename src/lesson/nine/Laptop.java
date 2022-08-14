package lesson.nine;

public class Laptop extends Electronics {
	int screenSize;
	String OS;
	int memory;

	public Laptop(String brand, double weight, int price, int screenSize, String OS, int memory) {
		super(brand, weight, price);
		this.screenSize = screenSize;
		this.OS = OS;
		this.memory = memory;

	}

}
