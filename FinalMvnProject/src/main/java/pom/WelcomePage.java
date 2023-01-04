package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WelcomePage extends BasePage
{
	public WelcomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	public void clickLogin() 
	{
		loginLink.click();
	}
	
	@FindBy(className = "ico-register")
	WebElement registerLink;
	
	public void registerClick() 
	{
		clickAction(registerLink);
	}
	
	@FindBy(linkText = "BOOKS")
	WebElement booksLink;
	
	public void booksLinkClick()
	{
		booksLink.click();
	}
	
	@FindBy (xpath = "(//span[@class='cart-label'])[1]")
	WebElement shoppingcart;
	
	public void clickshoppingcart()
	{
		shoppingcart.click();
	}
	
	@FindBy (xpath = "(//input[@type='button'])[3]")
	WebElement firstbook;
	
	public void clickfirstbook()
	{
		firstbook.click();
	}
	
	@FindBy (xpath = "//input[@name='removefromcart']")
	WebElement removebook;
	
	public void clickremovebook()
	{
		removebook.click();
	}
	
	@FindBy (xpath = "//input[@name='updatecart']")
	WebElement updatecart;
	
	public void clickupdatecart()
	{
		updatecart.click();
	}
	
	@FindBy (xpath = "//a[@href='https://demowebshop.tricentis.com/books?price=-25']")
	WebElement filterbyprice1;
	
	public void clickfilter()
	{
		filterbyprice1.click();
	}
	
	@FindBy (xpath = "//a[@class='remove-price-range-filter']")
	WebElement removefilter;
	
	public void clickremovefilter()
	{
		removefilter.click();
	}
	
	@FindBy (xpath = "//a[@href='https://demowebshop.tricentis.com/books?price=25-50']")
	WebElement filterbyprice2;
	
	public void clickfilter2() 
	{
		filterbyprice2.click();
	}
	
	@FindBy (xpath = "//a[@href='https://demowebshop.tricentis.com/books?price=50-']")
	WebElement filterbyprice3;
	
	public void clickfilter3() 
	{
		filterbyprice3.click();
	}

}
