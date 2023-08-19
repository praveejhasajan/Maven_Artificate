package com.blogger.locators;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.blogger.utils.CommonFunctions;

public class youtubeBasics{

	protected static Properties prop;
	@BeforeAll
	public static WebDriver driverInitialize()
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipseWS\\chromedriver.exe");
		
	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	 
			return driver;
	}	
		static WebDriver driver = driverInitialize();
		public static void navigateUrl(String url)
		{
			 driver = driverInitialize();
			driver.navigate().to(url);
			driver.manage().window().maximize();
		}
	
		
		public static void login() throws InterruptedException
		{
		CommonFunctions.enterLogin(driver,Locators.LOGINUSERNAMEXPATH,Locators.LOGINUSERNAME);
		CommonFunctions.PressNext(driver,Locators.NEXTBUTTON);
		CommonFunctions.enterLogin(driver,Locators.LOGINPWDXPATH,Locators.LOGINPWD);
		CommonFunctions.PressNext(driver,Locators.NEXTBUTTON);
		}

		public static void playshortVideo() throws InterruptedException
		{
			   WebElement playButton = driver.findElement(By.xpath(Locators.shortPLAYBUTTON));  
		   // Click the "Play" button
			    playButton.click();
				System.out.println("foundPlayButton");
				
		}
		public static void resize() {
			 org.openqa.selenium.Dimension newSize = new  org.openqa.selenium.Dimension(300, 300); // Replace with your preferred dimensions
		        driver.manage().window().setSize(newSize);
		        
		}
		public static void playfullVideo() throws InterruptedException
		{
			   WebElement playButton = driver.findElement(By.xpath(Locators.VideoPLAYBUTTON));  
		   // Click the "Play" button
			    playButton.click();
				System.out.println("foundPlayButton");
				
		}
		
		public static void readFile() {
	        // specify the file path
			   String filePath = "D:\\eclipseWS\\BlogPostSelenium\\maven_artificat\\tagList.txt";
			   File file = new File(filePath);
			   file.canRead();
		        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		            // read the file into a single string
		            String data = br.readLine();
		            System.out.println(data);
		        } catch (IOException e) {
		            System.out.println("Error reading file: " + e.getMessage());
		        }
	    }
		public static long getDuration(String loc)
		{
			int Min,sec;
			String Timeduration = CommonFunctions.getTextXpath(loc);
			String Part[]=Timeduration.split(":");
		
				 Min= Integer.parseInt(Part[0]);
				 sec= Integer.parseInt(Part[2]);
				
			
			long miliseconds = (Min*60L+sec)*1000;
			
			return miliseconds;
		}
		
		public static void closeBrowser()
		{
		driver.close();
		}
	 
}