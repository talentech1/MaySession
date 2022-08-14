package lesson.nine;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTabs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/msiddique/eclipse-workspace/MaySession/HTMLPages/NewTab.html");
		driver.findElement(By.linkText("Visit W3Schools!")).click();
		Set<String> windowIds = driver.getWindowHandles();
		
		System.out.println(windowIds);
		String currentWindow = driver.getWindowHandle();
		
		for (String winId : windowIds) {
			if(winId != currentWindow ) {
				driver.switchTo().window(winId);
			}
		}
	
		WebElement leartoCodeText = driver.findElement(By.xpath("//div[@id='main']/div[1]//h1[@class='learntocodeh1']"));
		System.out.println(leartoCodeText.getText());
		
		driver.quit();
		
	}

}
