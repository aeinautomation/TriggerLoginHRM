package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class LoginPage extends TestBase 
{
	//Page Factory
	@FindBy (xpath="//input[@name='username']")
	WebElement Validusername;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement Validpassword;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	private WebElement submitbtn;
	
	@FindBy (xpath = "//div[@id='divLogo']/img")
	private WebElement CRMLogo;
	
	//Constructor
	public LoginPage()
	{
		//Initialization of element 
		//Driver -for driver
		//this- for current class objects.
		PageFactory.initElements(getDriver(), this);
	}
	
	//Action Declaration
//	public String ValidateTitle()
//	{
//		return getDriver().getTitle();
//	}
//	
	public boolean ValidateLogo()
	{
		return CRMLogo.isDisplayed();
	}
	
	public Dashboard ValidateLoginCredintials(String un,String pass)
	{
		Validusername.sendKeys(un);
		Validpassword.sendKeys(pass);
		submitbtn.click();
		System.out.println("Login Successful");
		return new Dashboard();
	} 
}

