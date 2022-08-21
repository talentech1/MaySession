package lesson.ten;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/WaitPage.html");
		
		WebElement paragraph =  driver.findElement(By.cssSelector("p"));
		
		System.out.println(paragraph.getText());
	}

}
