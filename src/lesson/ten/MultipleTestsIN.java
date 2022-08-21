package lesson.ten;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTestsIN {
	WebDriver driver;
	
	@BeforeTest
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	@Test
	public void testOne() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		login("asd", "secret_sauce");
		String pageUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(pageUrl, "https://www.saucedemo.com/inventory.html");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	public void login(String user, String password) {
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}

}
