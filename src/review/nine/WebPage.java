package review.nine;

import org.openqa.selenium.WebDriver;

public class WebPage {
	String url;
	String logo;
	WebDriver driver;
	
	public WebPage(String url, String logo, WebDriver driver) {
		this.url = url;
		this.logo = logo;
		this.driver =  driver;
	}
	
	public void printUrl() {
		System.out.println(url);
	}
}
