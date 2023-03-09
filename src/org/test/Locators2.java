package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.Driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		WebElement txtid = driver.findElement(By.id("location"));
		txtid.sendKeys("thambaram");
	
		WebElement txtbtn = driver.findElement(By.className("_3iFC5"));
		txtbtn.click();
		
		
		
		
		
	}

}
