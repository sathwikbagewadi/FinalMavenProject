package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.ExcelLibrary;
import pom.BasePage;

public class RegisterTest extends BaseTest
{
	@Test(dataProvider = "Register")
	public void registerTestCase(String gender,String FirstName, String LastName, String email, String password) 
	{
		pom.WelcomePage welcomePage=new pom.WelcomePage(driver);
		welcomePage.registerClick();
		
		pom.RegisterPage registerPage=new pom.RegisterPage(driver);
		
		if(gender.contains("Female"))
		{
		    registerPage.clickFemaleRadio();
		}
		else if(gender.contains("Male"))
		{
			registerPage.clickMaleRadio();
		}
		registerPage.enterFirstName(FirstName);
		registerPage.enterLastName(LastName);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(password);
		registerPage.clickRegisterButton();
		
		
	}
	
	@DataProvider(name = "Register")
	public Object[][] testData() throws IOException
	{
		ExcelLibrary lib=new ExcelLibrary();
		
			return lib.readMultipleData("Register");
	}

}
