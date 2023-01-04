package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage
{
	public Loginpage(WebDriver driver) 
	{	
		super(driver);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	

	public WebElement getEmailTF() 
	{
		return emailTF;
	}

	public void setEmailTF(WebElement emailTF) 
	{
		this.emailTF = emailTF;
	}

	
	public void enterEmail(String email)
	{
		emailTF.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	 public WebElement passwordTF;
	
	public void enterPassword(String pwd) 
	{
		passwordTF.sendKeys(pwd);
	}
	public WebElement getPasswordTF()
	{
		return passwordTF;
	}

	public void setPasswordTF(WebElement passwordTF) 
	{
		this.passwordTF = passwordTF;
	}
	
	@FindBy (xpath = "//input[@class='button-1 login-button']")
	public WebElement loginbutton;
	
	public void clickloginbutton() 
	{
		loginbutton.click();
		
	}


}
