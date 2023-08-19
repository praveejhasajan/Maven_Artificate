package maven_package;
import org.openqa.selenium.WebDriver;
import com.blogger.locators.youtubeBasics;
public class YoutubeListPlayMulti extends youtubeBasics{
public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException
	{
		
	for(int i = 0;i<500;i++)
	{	
	
		YoutubePlaysingleVideo.main(new String[0]);
		YoutubePlaysingleVideo.main(new String[0]);
		YoutubePlaysingleVideo.main(new String[0]);
		YoutubePlaysingleVideo.main(new String[0]);
		
	}	

	closeBrowser();
	}
	
}
