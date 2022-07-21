package lesson.five;

import java.util.ArrayList;

public class Store {

	public static void main(String[] args) {
//		Fan fan = new Fan();
//		AirConditioner ac = new AirConditioner();
//		ac.printInfo();
//		System.out.println("--------");
//		fan.printInfo();
		
		Product freezer = new Product("Freezer", "Samsung", 1000.00, "Silver", 27);
		freezer.printInfo();
		
		Product ac = new Product("AC", "GE", 350.00, "White", 20); 	
		ac.printInfo();
		
		Product acTwo = new Product("Quiet AC", "Toshiba", 200, "Beige", 18);
		acTwo.printInfo();
		acTwo.stock = 5;
		System.out.println(acTwo.stock);
		System.out.println(freezer.stock);
		System.out.println(ac.stock);
		
		Product[] products = {freezer, ac, acTwo};
		System.out.println(products.length);
		
		System.out.println(products[0].name);
		System.out.println(products[0].stock);
		
		System.out.println(products[2].name);
		System.out.println(products[2].stock);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(freezer);
		productList.add(ac);
		
		productList.get(1).name = "Loud Ac";
		System.out.println(productList.get(1).name);
		
	}

}
