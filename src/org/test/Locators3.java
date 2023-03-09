package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.Driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement txtid= driver.findElement(By.id("userName"));
		txtid.sendKeys("9037834786");
		
		WebElement txtbtn = driver.findElement(By.id(""));
		txtbtn.click();
	}

}
