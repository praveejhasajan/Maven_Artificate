package maven_package;

import org.openqa.selenium.WebDriver;

import com.blogger.locators.youtubeBasics;
import com.blogger.utils.CommonFunctions;



public class FacebookLogin extends youtubeBasics{

public static WebDriver driver;
public static String emailId= "//input[@id='email']";
public static String password= "//input[@id='pass']";
public static String loginbutton="//button[@type='submit']";

	public static void main(String[] args) throws InterruptedException
	{try {
		String url = "https://www.facebook.com";	
	
		CommonFunctions.navigateUrl(url);
	
		System.out.println("Facbook Opening");
		Thread.sleep(4000);
		
			CommonFunctions.waitStaleness(emailId);
		
		
		CommonFunctions.enterText(emailId, "sajan93vats@gmail.com");
		Thread.sleep(2000);
		CommonFunctions.waitStaleness(password);
		CommonFunctions.enterText(password, "Sajan@may23");
		Thread.sleep(2000);
		CommonFunctions.waitVisibility(password);
		CommonFunctions.clickByXpath(loginbutton);
	

} catch (Exception e) {
	}
	}}

