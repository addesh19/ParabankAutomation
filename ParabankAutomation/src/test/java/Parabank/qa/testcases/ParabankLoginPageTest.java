package Parabank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Parabank.qa.base.TestBase;
import Parabank.qa.pages.ParabankHomePage;
import Parabank.qa.pages.ParabankLoginPage;

public class ParabankLoginPageTest extends TestBase{
	
	ParabankLoginPage loginPage;
	ParabankHomePage homePage;
	public ParabankLoginPageTest(){
		// to call Test Base class constructor  
		super();
	}
	@BeforeMethod
	public void setup(){
		//Called initialization of Base class to avoid null pointer exception
		initialization();
		
		//create object of loginPage class
		loginPage =new ParabankLoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title= loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title,"ParaBank | Welcome | Online Banking");
	}
	
	@Test(priority=2)
	public void LoginTest(){
		
		loginPage.login(prop.getProperty("username"),prop.getProperty("pasword"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
