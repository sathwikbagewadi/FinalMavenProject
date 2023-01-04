package testScripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pom.Loginpage;
import pom.WelcomePage;

public class BooksLinkTest extends BaseTest
{ 
	@Test //ADD BOOK
	public void BooksTest1() throws InterruptedException 
	{
		pom.WelcomePage welcomePage=new pom.WelcomePage(driver);
		welcomePage.booksLinkClick();
		welcomePage.clickfirstbook();
		Thread.sleep(2000);
	    welcomePage.clickshoppingcart();
		Thread.sleep(5000);
}
	
	@Test //REMOVE BOOK
	public void BooksTest2() throws InterruptedException 
	{
		pom.WelcomePage welcomePage=new pom.WelcomePage(driver);
		welcomePage.booksLinkClick();
		welcomePage.clickfirstbook();
		Thread.sleep(2000);
	    welcomePage.clickshoppingcart();
		Thread.sleep(5000);
		welcomePage.clickremovebook();
		Thread.sleep(2000);
		welcomePage.clickupdatecart();
		Thread.sleep(2000);
	}
	
}