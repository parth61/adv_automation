package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;

public class LoginPageRepository 
{
	WebDriver wd;
	public LoginPageRepository(WebDriver wd) {
		this.wd = wd;
	}
	By un = By.name("username");
	By pwd = By.name("password");
	By LoginBtn = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
	By ForgotPwd = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]");
	
//	private void setUname(WebDriver wd, String uname) 
//	{
//		wd.findElement(un).sendKeys(uname);
//	}
//	
//	private void setPasswrd(WebDriver wd, String pass) 
//	{
//		wd.findElement(un).sendKeys(pass);
//	}
//	
//	private void clickLogin(WebDriver wd) 
//	{
//		wd.findElement(un).click();
//	}
	
	public void LoginProcess(String uname, String pass) 
	{
		wd.findElement(un).sendKeys(uname);
		wd.findElement(pwd).sendKeys(pass);
		wd.findElement(LoginBtn).click();
	}
}
