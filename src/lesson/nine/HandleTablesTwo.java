package lesson.nine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTablesTwo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/Tables.html");

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		for (WebElement r : rows) {
			List<WebElement> datas = r.findElements(By.tagName("td"));
			if (datas.size() > 0) {
				System.out.println(datas.get(0).getText());
			}

		}

		driver.quit();
	}

}
