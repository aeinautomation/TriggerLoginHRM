package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.TestBase;

public class Dashboard extends TestBase
{
	@FindBy (xpath="//a[@id='menu_admin_viewAdminModule']")
	WebElement admin;
	
	@FindBy (xpath="//a[@id='menu_pim_viewPimModule']")
	WebElement PIM;
	
	@FindBy (xpath="//a[@id='menu_leave_viewLeaveModule']")
	WebElement leave;
	
	@FindBy (xpath="//a[@id='menu_time_viewTimeModule']")
	WebElement time;
	
	@FindBy (xpath="//a[@id='menu_recruitment_viewRecruitmentModule']")
	WebElement recuirement;
	
	@FindBy(xpath="//a[@id='menu_pim_viewMyDetails']")
	WebElement myinfo;
	
	@FindBy(xpath="//a[@id='menu__Performance']")
	WebElement performance;
	
	@FindBy(xpath="//a[@id='menu_directory_viewDirectory']")
	WebElement directory;
	
	@FindBy (xpath="menu_maintenance_purgeEmployee")
	WebElement maintenance;
	
	@FindBy (xpath="menu_buzz_viewBuzz")
	WebElement buzz;
	
	//AdminPage 
		@FindBy (xpath="//input[@id='searchSystemUser_userName']")
		WebElement adminID;
		
	@FindBy (xpath="//input[@name='searchSystemUser[employeeName][empName]']")
		WebElement employeename;
		
		@FindBy (xpath="//input[@id=\"searchBtn\"]")
		WebElement admin_search_btn;
		
		//For Drop down User Role	
		@FindBy (xpath="//select[@id=\"searchSystemUser_userType\"]")
		WebElement Dropdown_allUserrole;
		
		//For Drop Down Status
		@FindBy (xpath="//select[@id=\"searchSystemUser_status\"]")
		WebElement dropdown_status;
		
		
		@FindBy (xpath="//input[@id=\"resetBtn\"]")
		WebElement admin_reset;
		
	//admin add
		@FindBy (xpath="//input[@id=\"btnAdd\"]")
		WebElement admin_addbutton;
		
		@FindBy (xpath="//select[@id=\"systemUser_userType\"]")
		WebElement admin_userrole;
	
		@FindBy (xpath="//input[@id=\"systemUser_employeeName_empName\"]")
		WebElement admin_employeename;
		
		@FindBy (xpath="//input[@id=\"systemUser_userName\"]")
		WebElement admin_username;
		
		@FindBy (xpath="//select[@id=\"systemUser_status\"]")
	WebElement admin_status;
		
		@FindBy (xpath="//input[@id=\"systemUser_password\"]")
		WebElement admin_password;
		
		@FindBy (xpath="//input[@id=\"systemUser_confirmPassword\"]")
		WebElement admin_confirmPassword;
		
		// Admin save Button
		@FindBy (xpath="//input[@id=\"btnSave\"]")
		WebElement admin_savebutton;
		
		@FindBy (xpath="//input[@id=\"btnCancel\"]")
		WebElement admin_Cancelbutton;

		//admin job
		@FindBy (xpath="//div[@id=\"mainMenu\"]/ul/li/ul/li[2]/a[@id=\"menu_admin_Job\"]")
		WebElement addjob;
		
		@FindBy (xpath="//div[@id=\"mainMenu\"]/ul/li/ul/li/ul/li/a[@id=\"menu_admin_viewJobTitleList\"]")
		WebElement jobtitle;
		
		//Logout Page 
		@FindBy (xpath="//div[@id='wrapper']/div/a[2]")
		WebElement logout;
			
	//initialization of page objects
	
	public Dashboard()
	{
		PageFactory.initElements(getDriver(), this);
	}
	public LoginPage Click_Logout()
	{
		logout.click();
		return new LoginPage();
	}
//	public void AdminPageCredintails(String un, String empname)
//	{
//		adminID.sendKeys(un);
//		employeename.sendKeys(empname);
//		Select select= new Select(Dropdown_allUserrole);
//		select.selectByIndex(2);
//		
//		Select select1 = new Select(dropdown_status);
//		select1.selectByIndex(2);
//		admin_search_btn.click();
//	}
//	
//	public void VerifyAdmin_Add_Button()
//	{
//		admin.click();
//		admin_addbutton.click();
//		Select select = new Select(admin_userrole);
//		select.selectByIndex(1);
//		admin_userrole.sendKeys("Developer");
//		admin_employeename.sendKeys(prop.getProperty("username"));
//		admin_username.sendKeys("Joy Martine");
//		Select select1= new Select(admin_status);
//		select1.selectByIndex(1);
//		admin_password.sendKeys("joy.martine");
//		admin_confirmPassword.sendKeys("joy.martine");
//		admin_savebutton.click();
//		//admin_Cancelbutton.click();
//	}
//	
//	public Dashboard verifyAddJobDash()
//	{
//		admin.click();
//		Actions action= new Actions(getDriver());
//		action.moveToElement(addjob).build().perform();
//		jobtitle.click();
//		return new Dashboard();
//	}
	
}
