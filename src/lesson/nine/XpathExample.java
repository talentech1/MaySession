package lesson.nine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/ItesmLoop.html");
		//WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div"));
		WebElement title = driver.findElement(By.xpath("//div[@class='inventory_item_desc'][1]"));
		System.out.println(title.getText());
	}

}
