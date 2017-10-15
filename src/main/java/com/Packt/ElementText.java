package com.Packt;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.Assert;

public class ElementText {

	private static WebDriver driver;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
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

	@Test
	public void testElement() {

		WebElement message = driver.findElement(By.id("message"));
		String messageText = message.getText();
	
}

	@Test
	public void testElementStyle(){
		WebElement message = driver.findElement(By.id("message"));
		String width = message.getCssValue("width");
		//assertEquals("150px" , width);
		
	}
	
	@Test
	public void testDefaultSelectedCheckbox() {

		// Expected list of selected Checkbox
		List<String> checked = Arrays
				.asList("user128_admin", "user220_browser");

		// Create an instance of JavaScript Executor from driver
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Locate all the Checkbox which are checked by calling jQuery find()
		// method.
		// find() method returns elements in array
		@SuppressWarnings("unchecked")
		List<WebElement> elements = (List<WebElement>) js
				.executeScript("return jQuery.find(':checked')");

		// Verify two Checkbox are selected
		//assertEquals(elements.size(), 2);

		// Verify correct Checkbox are selected
		//for (WebElement element : elements) {
			//assertTrue(checked.contains(element.getAttribute("id")));
		}
	

	@Test
	
	//How to verify Alert present in the UI 
	public void testSimpleAlert(){
		WebElement button = driver.findElement(By.id("simple"));
		button.click();
	}
	
	
	
	
	

@Test
public void testJavaScriptCalls()throws Exception
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	String title = (String)js.executeScript("return document.title");
	//assertEquals("Google", title);
	
	long links = (Long)js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
	js.executeScript("document.getElementByID('name').value= arguments[0]", "John");
	
	
}

}//End of class