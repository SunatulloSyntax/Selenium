package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLVerification {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.syntaxtechs.com");
		
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("syntax")) {
			System.out.println("Contains Syntax");
		}else {
			System.out.println("Does not contain Syntax");
		}
		driver.close();
	}
}
