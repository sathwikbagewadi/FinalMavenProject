package testScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import generic.ScreenShotMethods;
import pom.Loginpage;

public class LoginTest extends BaseTest
{
	@Test(dataProvider = "Login")
	public void testCase1(String username, String Password) throws InterruptedException 
	{
		pom.WelcomePage welcomePage=new pom.WelcomePage(driver);
		welcomePage.clickLogin();
		Loginpage loginPage=new Loginpage(driver);
		Thread.sleep(2000);
		loginPage.enterEmail(username);
		loginPage.enterPassword(Password);
		loginPage.loginbutton.click();
		Thread.sleep(2000);
		//ScreenShotMethods.pageScreenshot(driver);
		//ScreenShotMethods.elementScreenshot(loginPage.getPasswordTF());
		
		if (driver.getCurrentUrl().contains("login"))
		{
			System.out.println("Login Credentials incorrect - Test Pass");
		}
		else
		{
			System.out.println("Login Credentials are correct - Login Successful");
		}
	}
	
	@DataProvider(name = "Login")
	public Object[][] testData() throws IOException 
	{
		ExcelLibrary lib=new ExcelLibrary();
		
		return lib.readMultipleData("Login");
		
	}
}
