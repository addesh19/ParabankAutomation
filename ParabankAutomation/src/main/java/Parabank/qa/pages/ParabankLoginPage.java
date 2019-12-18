package Parabank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Parabank.qa.base.TestBase;

public class ParabankLoginPage extends TestBase{
	//created web elements for customer login 
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginBtn;
	
	//Created constructor for login page and initialized this class
	
	public ParabankLoginPage (){
		
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	public ParabankHomePage login(String un,String pwd){
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
		
		return new ParabankHomePage();
	}
}
