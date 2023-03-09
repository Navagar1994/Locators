package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("chennai");
		
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("dharmapuri");
				
		WebElement txtdate = driver.findElement(By.id("onward_cal"));
		txtdate.sendKeys("05-12-2022");
		
		WebElement txtbtn= driver.findElement(By.id("search_btn"));
		txtbtn.click();
	}

}
