package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLessonTest {

	public static void main(String[] args) throws InterruptedException {

		// objects and variables instantiation

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String appUrl = "https://www.facebook.com";

		// launch the firefox browser and open the application url

		driver.get(appUrl);

		// maximize the browser window

//		driver.manage().window().maximize();

		// declare and initialize the variable to store the expected title of the
		// webpage.

		String expectedTitle = "Fogot account?";

		// fetch the title of the web page and save it into a string variable

		String actualTitle = driver.getTitle();

		// compare the expected title of the page with the actual title of the page and
		// print the result

		if (expectedTitle.equals(actualTitle))

		{

			System.out.println("Verification Successful - The correct title is displayed on the web page.");

		}

		else

		{

			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");

		}

		// enter a valid username in the email textbox

//		WebElement username = 
		driver.findElement(By.id("email")).sendKeys("saeedaliev@gmail.com");

//		username.clear();
//		driver.findElement(By.cl).click();
//		sendKeys("test@gmail.com");

		// enter a valid password in the password textbox

//		WebElement password = 
		driver.findElement(By.id("pass")).sendKeys("password123");

//		password.clear();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
//		password.sendKeys("password123");

		// click on the Sign in button

//		WebElement SignInButton = 
//		driver.findElement(By.id("signIn")).click();

//		SignInButton.click();

		// close the web browser

		driver.close();

		System.out.println("Test script executed successfully.");

		// terminate the program

		System.exit(0);

	}
}
