package com.blogger.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.blogger.locators.Locators;
import com.blogger.locators.youtubeBasics;

public class CommonFunctions extends youtubeBasics{
	static WebDriver driver ;
	static WebDriverWait wait;
	
	
/*	public static void waitPageLoaded()
	{
		wait.until(new ExpectedCondition<Boolean>()
		{
			public Boolean apply(WebDriver input)
			{
				return((JavaScriptExecutor) driver).executeScript("return document.readState").equals("complete");
				}
			
		});
	}
	*/
	public static void clickAllElements(String locator)
	{
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		for (WebElement element : elements) {
		element.click();
		}
	}
	public static void clickPlayButton() {
	WebElement playButton = driver.findElement(By.xpath(Locators.PLAYBUTTON));  
    // Click the "Play" button
    playButton.click();
	}
	
	public static void waitVisibility(String locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	public static void waitVisibilityById(String locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}
	
	public static void waitStaleness(String locator)
	{
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath(locator))));
	}
	
	public static void elementIsClickable(String locator)
	{
		
		WebElement element = driver.findElement(By.xpath(locator));
		
		if (element.isEnabled())
		//	  # Element is enabled, so you can click it
			  element.click();
			else {
		//	  # Element is not enabled, so you cannot click it
				System.out.println("Element Not clickable");
			}
	}
	
	public static void pressKeyByXpath(String locator,String command)
	{
		WebElement element = driver.findElement(By.xpath(locator));
		String key = command.toLowerCase();
		switch(key)
		{
		case "enter" : 
			element.sendKeys(Keys.ENTER);
			break;
		
		case "Tab" : 
			element.sendKeys(Keys.TAB);
			break;
		
		case "down" : 
			element.sendKeys(Keys.DOWN);
			break;
		
		case "space" : 
			element.sendKeys(Keys.SPACE);
			break;
		}
		
		
	}
	public static void pressKey(String locator,String command)
	{
		WebElement element = driver.findElement(By.id(locator));
		String key = command.toLowerCase();
		switch(key)
		{
		case "enter" : 
			element.sendKeys(Keys.ENTER);
			break;
		
		case "Tab" : 
			element.sendKeys(Keys.TAB);
			break;
		
		case "left" : 
			element.sendKeys(Keys.LEFT);
			break;
		
		case "space" : 
			element.sendKeys(Keys.SPACE);
			break;
		}
		
		
	}
	public static void clickByXpath(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public static void clickById(String locator)
	{
		driver.findElement(By.id(locator)).click();
	}
	
	public static String getText(String locator)
	{
		
		String text = (driver.findElement(By.xpath(locator))).getAttribute("tittle");
		return text;
	}
	
	
	public static void browserManage()
	{
	//	Assertions.fail();
		driver.close();
		driver.quit();
		   
	}
	
	public static void highLighterMethod(String locator){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(locator));
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}
	
	public static void enterText(String locator, String text)
	{
		driver.findElement(By.id(locator)).sendKeys(text);
	}
	
	public static void waitVisibility(By element)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public static void clickByXpath(By element)
	{
		driver.findElement(element).click();
	}
	
	public static void getText(By element)
	{
		driver.findElement(element).getText();
	}
	
	
	public static void enterLogin(WebDriver driver, String locator,String username)
	{
		    // Find the email field and enter the email
		    WebElement emailField = driver.findElement(By.xpath(locator));
		    emailField.sendKeys(username);
	 }
	
	public static void PressNext(WebDriver driver,String locator)
	{
		    // Find the "Next" button and click it
		    WebElement nextButton = driver.findElement(By.xpath(Locators.NEXTBUTTON));
		    nextButton.click();
	}
}
 