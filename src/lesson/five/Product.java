package lesson.five;

public class Product {
	String name;
	String brand;
	double price;
	String color;
	int size;
	int stock;

	public Product(String name, String brand, double price, String color, int size) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}

	public void printInfo() {
		System.out.println("Name:" + name + ",Brand: " + brand + ", Color:" + color + ", Size:" + size + ", Price: " + price);
	}
	

}
