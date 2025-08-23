package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFctry_Login {

	WebDriver wd;
	public PageFctry_Login(WebDriver wd)
	{
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}
//repository of webelement	
	@FindBy(name="user_name_entry_field") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="SubmitUser") WebElement login;
	@FindBy(linkText = "Logout") WebElement logout;
	@FindBy WebElement CancelOrder;
	
//	public void clkCancelOrder() 
//	{
//		CancelOrder.click();
//	}
	//repository of methods
	public void setUn(String un) {
		username.clear();
		username.sendKeys(un);
	}

	public void setPwd(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clkLogin() {
		login.click();
	}
	
	public void clkLogout() {
		logout.click();
	}
}
