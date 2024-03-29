package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//system is a class. setProperty(); is a static method
		//             key           value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		//https ->hypertext transfer protocol
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		//browser navigation commands.
		//it will navigate to a given url
		driver.navigate().to("http://www.facebook.com");
		//it will navigate back
		driver.navigate().back();	
		//it will navigate one step forward
		driver.navigate().forward();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.close();
		

	}
}
