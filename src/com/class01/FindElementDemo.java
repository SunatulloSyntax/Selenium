package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		Thread.sleep(5000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(7000);
		
		driver.close();
		
		
	}
}
