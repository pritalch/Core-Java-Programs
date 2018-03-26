package com.au.ex;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSubject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\choudhp\\Desktop\\Prital_Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com/");
		Thread.sleep(4000);
		
        //driver.get("https://www.gmail.com/");
        driver.findElement(By.cssSelector("input[name=identifier]")).sendKeys("prital.choudhari@quagnitia.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("shashekala@1993");
        
        driver.findElement(By.id("passwordNext")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        List<WebElement> subject = driver.findElements(By.className("bog"));
        
        for (int i = 0; i <50; i++) {
        	System.out.println("Mail Subjects are: "+subject.get(i).getText());	
		}
	}

}
