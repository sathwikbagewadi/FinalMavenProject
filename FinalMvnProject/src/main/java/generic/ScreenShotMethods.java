package generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethods implements FrameWorkConstants
{
	static String time = LocalDateTime.now().toString();  //12-09-20222
	static String newstr = time.replace(':', '-');   //12:09:2022
	static String Username="";
	
	public static void elementScreenshot(WebElement element) 
	{

		File temp= element.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH+newstr+Username+".png");
		try 
		{
			FileHandler.copy(temp, dest);
		} 
		catch (IOException e) 
		{
		e.printStackTrace();
		}
	}
 
	public static void pageScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest =new File(SCREENSHOT_PATH+newstr+".png");
		try
		{
			FileHandler.copy(temp, dest);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
