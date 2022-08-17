package TestClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.Dashboard;
import Pages.LoginPage;

public class Login1 extends TestBase
{
	Dashboard dashboard;
	LoginPage loginpage;
	
	
	@Parameters("browser")
	@BeforeMethod
	public void setup()
	{
		launchApp(); 
	}
	@Test(priority = 1)
	public void ValidateTitleTest()
	{
		loginpage=new LoginPage();
		System.out.println("Welcome To Orange HRM");
		String title=getDriver().getTitle();
		//Assert.assertEquals(title,"OrangeHRM");
		}
	
	@Test(priority = 2)
	public void ValidateLoginCredinatilTest() throws InterruptedException
	{
		Thread.sleep(3000);
		//WebDriver wait =new WebDriver(driver,3);
		loginpage=new LoginPage();
		dashboard=loginpage.ValidateLoginCredintials(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Login Successfull with Valid Credintila");
		//System.out.println("Login unsuccessfull with Valid Credintila");
	}
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}
