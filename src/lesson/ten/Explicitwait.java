package lesson.ten;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/ItesmLoop.html");
		
		WebElement lastItem = new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body .inventory_item:nth-child(12)")));
		
		List<WebElement> items = driver.findElements(By.className("inventory_item"));
		
		System.out.println(items.size());

	}

}
