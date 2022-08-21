package review.nine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		printFamilyName();
		System.out.println("Hello! " + familyName);
		
		WebDriver driver = new ChromeDriver();
		
		WebPage google = new WebPage("google.com", "gogole logo", driver);
		google.printUrl();
		
		WebPage amazon = new WebPage("amazon.com", "Amazon logo", driver);
		amazon.printUrl();
	}

}
