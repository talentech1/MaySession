package review.eight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleElemets {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		List<WebElement> items;
		items = driver.findElements(By.className("inventory_item"));
		System.out.println(items.size());
		
		for(int i =0; i<items.size(); i++) {
			String title = items.get(i).findElement(By.className("inventory_item_name")).getText();
			String price = items.get(i).findElement(By.className("inventory_item_price")).getText();
			System.out.println(title + " : " + price);
			System.out.println("------------------------------");
		}
		
		driver.close();
		

	}

}
