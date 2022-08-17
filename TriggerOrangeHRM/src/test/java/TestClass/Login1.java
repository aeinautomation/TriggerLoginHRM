package TestClass;
import org.testng.Assert;
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
	
	public Login1()
	{
		super();
	}
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
		System.out.println("Welcome");
		String title=getDriver().getTitle();
		Assert.assertEquals(title,"OrangeHRM");
	}
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
}
