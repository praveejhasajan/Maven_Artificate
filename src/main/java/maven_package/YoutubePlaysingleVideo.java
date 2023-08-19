package maven_package;


import org.openqa.selenium.WebDriver;
import com.blogger.locators.youtubeBasics;



public class YoutubePlaysingleVideo extends youtubeBasics{

public static WebDriver driver;

	static String url = "https://www.youtube.com/watch?v=Qn4C6g0p-_E";/*,//India gate
	"https://www.youtube.com/watch?v=iHqqP1P3UrY&t=21s",//ChandaniChowk
	"https://www.youtube.com/watch?v=uO4xPjmffV4&t=13s",//Promotion
	"https://www.youtube.com/watch?v=KSo4ILHFX2A",//Vaishno devi
	"https://www.youtube.com/watch?v=KSo4ILHFX2A",//White sauce pasta
	"https://www.youtube.com/watch?v=eRwOh3hY62M",//Bread pkode
	"https://www.youtube.com/watch?v=Et748xIuY6E"// A day in my life 
);*/
	public static void main(String[] args) throws InterruptedException
	{		
	
		navigateUrl(url);
		Thread.sleep(2000);
		System.out.println("Youtube Playing");
	
	
		playfullVideo();
		
		resize();
	
	}
	}
	
