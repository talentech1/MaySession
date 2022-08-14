package lesson.nine;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTabsTwo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/NewTab.html");
		driver.findElement(By.linkText("Visit W3Schools!")).click();
		driver.findElement(By.linkText("Visit Google!")).click();
		driver.findElement(By.linkText("Visit Yahoo!")).click();
		driver.findElement(By.linkText("Visit Amazon!")).click();

		Set<String> tabIds = driver.getWindowHandles();

		for (String id : tabIds) {
			driver.switchTo().window(id);
			String pageUrl = driver.getCurrentUrl();
			System.out.println(pageUrl);
			if (pageUrl.equals("https://www.yahoo.com/")) {
				break;
			}
		}

		WebElement weatherEl = driver.findElement(By.xpath("//html[@id='atomic']//div[@id='grid-layout']/div[2]/div"));
		Thread.sleep(5000);
		System.out.println(weatherEl.getText());
		driver.quit();

	}

}
