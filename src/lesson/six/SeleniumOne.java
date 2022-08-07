package lesson.six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","libs/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		Thread.sleep(3000);
		
		WebElement gettingStartedLink = driver.findElement(By.linkText("Getting started"));
		gettingStartedLink.click();
		
		WebElement body = driver.findElement(By.className("td-section"));
		System.out.println(body.getText());
		
	}

}
