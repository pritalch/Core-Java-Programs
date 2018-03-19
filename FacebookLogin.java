package com.au.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choudhp\\Desktop\\Prital_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);

		// TC1: Without entering details click on login button
		driver.findElement(By.id("loginbutton")).click();

		WebElement l1 = driver.findElement(By.cssSelector("._4rbf"));
		System.out.println(l1.getText());
		driver.navigate().back();

		// TC2: Only enter email and click on login page
		driver.findElement(By.id("email")).sendKeys("aa@ab");
		driver.findElement(By.id("loginbutton")).click();

		WebElement l2 = driver.findElement(By.cssSelector("._4rbf"));
		System.out.println(l2.getText());
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();

		// TC3: Only enter password and click on login page
		driver.findElement(By.id("pass")).sendKeys("aa@ab");
		driver.findElement(By.id("loginbutton")).click();

		WebElement l3 = driver.findElement(By.cssSelector("._4rbf"));
		System.out.println(l3.getText());
		driver.navigate().back();
		driver.findElement(By.id("pass")).clear();
		
		// TC4: Enter correct email and password and click on login page
		driver.findElement(By.id("email")).sendKeys("john1888j@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("john1988");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement accountSettings = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account Settings")));
		accountSettings.click(); //this will click on setting link to open menu

		WebElement logOut = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		logOut.click(); // this will click on logout link   
	}

}
