package lesson.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMetrhods {
	static WebDriver driver;
 
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userNameFiled = driver.findElement(By.id("user-name"));
		userNameFiled.sendKeys("doesnotexist");
		login("locked_out_user", "secret_sauce");
		
		login("fasdf", "1231343");
		
		login("", "-----");
	
		login("@$#%@^%#", "@$#%@^%#");

	}
	
	public static void login(String userName, String password) throws InterruptedException {
		WebElement userNameFiled = driver.findElement(By.id("user-name"));
		userNameFiled.clear();
		userNameFiled.sendKeys(userName);
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

}
