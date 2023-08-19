package maven_package;

import org.openqa.selenium.WebDriver;
import com.blogger.locators.youtubeBasics;



public class YouTubeIndividualShort extends youtubeBasics{

public static WebDriver driver;

	public static String url ="https://www.youtube.com/shorts/mhBt1p4HMpY";

	public static void main(String[] args) throws InterruptedException
	{				
	
	for(int i = 0;i<500;i++)
	{	
		navigateUrl(url);
		Thread.sleep(3000);
		System.out.println("Youtube Playing");
		playVideo();
		Thread.sleep(23000);
		
		
	}	
	closeBrowser();
	}
}

