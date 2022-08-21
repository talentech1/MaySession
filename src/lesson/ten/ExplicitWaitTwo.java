package lesson.ten;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTwo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/ItesmLoop.html");
		
		Wait<WebDriver> waitSixty = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		Wait<WebDriver> waitTen = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		waitTen.until(ExpectedConditions.numberOfElementsToBe(By.className("inventory_item"), 11));
		
		List<WebElement> items = driver.findElements(By.className("inventory_item"));
		
		System.out.println(items.size());
		
		driver.quit();
	}

}
