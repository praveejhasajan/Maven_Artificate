package maven_package;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;

import com.blogger.locators.Locators;
import com.blogger.locators.youtubeBasics;



public class YoutubeListPlay extends youtubeBasics{

public static WebDriver driver;

	static List<String> urlList = Arrays.asList(
	"https://www.youtube.com/watch?v=Qn4C6g0p-_E",//India gate
	"https://www.youtube.com/watch?v=iHqqP1P3UrY&t=21s",//ChandaniChowk
	"https://www.youtube.com/watch?v=uO4xPjmffV4&t=13s",//Promotion
	"https://www.youtube.com/watch?v=KSo4ILHFX2A",//Vaishno devi
	"https://www.youtube.com/watch?v=KSo4ILHFX2A",//White sauce pasta
	"https://www.youtube.com/watch?v=eRwOh3hY62M",//Bread pkode
	"https://www.youtube.com/watch?v=Et748xIuY6E"// A day in my life 
);
	public static void main(String[] args) throws InterruptedException
	{		
	
	for(int i = 0;i<500;i++)
	{	
	
		for(String url : urlList)	
		{
		navigateUrl(url);
		Thread.sleep(2000);
		System.out.println("Youtube Playing");
	
	
		playfullVideo();
		
		resize();
	//	long milsec = getDuration(Locators.duration);
	//	System.out.println(+milsec);
	
		Thread.sleep(480000);
		}}
	}
	}
	
