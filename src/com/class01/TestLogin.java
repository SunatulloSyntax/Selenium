package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://canvas.instructure.com/login/canvas");
		
		driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("saeedaliev@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.id("pseudonym_session_password")).sendKeys("Eclipse!@#93");
		Thread.sleep(4000);
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
