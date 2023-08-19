package maven_package;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.blogger.locators.Locators;
import com.blogger.locators.youtubeBasics;
import com.blogger.utils.CommonFunctions;



public class YoutubeListTagUpdate extends youtubeBasics{

public static WebDriver driver;

static String studioUrl ="https://studio.youtube.com/";
static String Url ="https://youtube.com/login";

	static List<String> urlList = Arrays.asList(
	"https://www.youtube.com/shorts/O1Kf_dxIkS0",
//	"https://www.youtube.com/shorts/7QAulJrA4iA",
	"https://www.youtube.com/shorts/pfPnPIPuK0Q",
	"https://www.youtube.com/shorts/ciVnD7HdUMY",
	"https://www.youtube.com/shorts/R9dCvPx9jIo",
	"https://www.youtube.com/shorts/hYXDSNJmS0M",
	"https://www.youtube.com/shorts/BZgl_IrhW-w",
	"https://www.youtube.com/shorts/qNPSv-IERjo"
	);
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = driverInitialize();
		driver.navigate().to(studioUrl);
	//	driver.manage().window().maximize();
		
		CommonFunctions.enterLogin(driver,Locators.LOGINUSERNAMEXPATH,Locators.LOGINUSERNAME);
		CommonFunctions.PressNext(driver,Locators.NEXTBUTTON);
		CommonFunctions.enterLogin(driver,Locators.LOGINPWDXPATH,Locators.LOGINPWD);
		CommonFunctions.PressNext(driver,Locators.NEXTBUTTON);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Get all the keywords from the webpage
        String keywords = (String) js.executeScript("return KeywordsEverywhere.getKeywords();");

        // Print the keywords
        System.out.println(keywords);
		
	//	readFile();
		
		
	/*		int flag = 0;				
	
	for(int i = 0;i<500;i++)
	{	Thread.sleep(3000);
		driverInitialize();
		for(String url : urlList)	
		{
		navigateUrl(url);
		Thread.sleep(6000);
		System.out.println("Youtube Playing");
		if(flag<1)
		{
		playVideo();
		}
		
		flag++;
		Thread.sleep(20000);
		}
		closeBrowser();
	}	
*/
	
	}
	
}
