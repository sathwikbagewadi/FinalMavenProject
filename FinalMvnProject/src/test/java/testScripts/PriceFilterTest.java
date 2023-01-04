package testScripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pom.Loginpage;
import pom.WelcomePage;

public class PriceFilterTest extends BaseTest
{
	@Test
	public void PriceFilterTest1() throws InterruptedException 
	{
		pom.WelcomePage welcomePage=new pom.WelcomePage(driver);
		welcomePage.booksLinkClick();
		Thread.sleep(2000);
		welcomePage.clickfilter();
		Thread.sleep(2000);
		welcomePage.clickremovefilter();
		Thread.sleep(2000);
		welcomePage.clickfilter2();
		Thread.sleep(2000);
		welcomePage.clickremovefilter();
		Thread.sleep(2000);
		welcomePage.clickfilter3();
		Thread.sleep(2000);
		welcomePage.clickremovefilter();
		Thread.sleep(2000);
}}
