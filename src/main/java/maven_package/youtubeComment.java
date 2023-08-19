package maven_package;

import com.blogger.locators.Locators;
import com.blogger.locators.youtubeBasics;

public class youtubeComment extends youtubeBasics{

	public static void main(String[] args)throws InterruptedException
	{
		try
		{
			
		driverInitialize();
		navigateUrl(Locators.LOGINURL);
		Thread.sleep(5000);
		login();
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
