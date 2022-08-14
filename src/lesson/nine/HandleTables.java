package lesson.nine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/Tables.html");
		
		for(int i=2; i<8; i++) {
			WebElement com = driver.findElement(By.cssSelector("tr:nth-of-type("+ i +") > td:nth-of-type(1)"));
			System.out.println(com.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
