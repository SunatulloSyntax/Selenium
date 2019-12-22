package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWikipedia {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.wikipedia.org");
		driver.findElement(By.button("English")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("searchInput")).sendKeys("Software");
		Thread.sleep(5000);
		driver.close();;
	}
}
