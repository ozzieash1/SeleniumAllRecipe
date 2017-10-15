package com.Packt;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testElementPage extends ElementText  {
	ElementText elementText = new ElementText();

	WebDriver driver;
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/WS/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/Dell/chromeDriver");
		driver = new ChromeDriver();
		//driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		//driver.get("http://www.google.com");
		driver.get("http://cookbook.seleniumacademy.com/Locators.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
