package lesson.nine;

public abstract class Electronics {
	double weight;
	String brand;
	int price;
	boolean sold = false;

	public Electronics(String brand, double weight, int price) {
		this.weight = weight;
		this.brand = brand;
		this.price = price;
	}

	public void sell() {
		this.sold = true;
	}

}
