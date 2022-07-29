package lesson.fix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement userNameTextField = driver.findElement(By.id("user-name"));
		userNameTextField.sendKeys("locked_out_user");

		WebElement passwordTextFiled = driver.findElement(By.id("password"));
		passwordTextFiled.sendKeys("secret_sauce");

		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();

		Thread.sleep(3000);

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl == "https://www.saucedemo.com/inventory.html") {
			WebElement sortDropDown = driver.findElement(By.className("product_sort_container"));

			Select selectSortDropDown = new Select(sortDropDown);
			selectSortDropDown.selectByIndex(2);

			Thread.sleep(3000);
			sortDropDown = driver.findElement(By.className("product_sort_container"));

			selectSortDropDown = new Select(sortDropDown);
			selectSortDropDown.selectByVisibleText("Name (Z to A)");
		} else {
			System.out.println("LOGIN WAS UnSuccessfull");
		}

	}

}
