package HDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FA_LoginRepository {
	WebDriver wd;
	public FA_LoginRepository(WebDriver wd) {
		this.wd = wd;
	}
	By un = By.name("user_name_entry_field");
	By pwd = By.name("password");
	By LoginBtn = By.name("SubmitUser");
	
	public void openUrl() {
		wd.get("http://www.demo.frontaccounting.eu/");
	}
	
	public void setUname(String uname) {
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(un));
		wd.findElement(un).clear();
		wd.findElement(un).sendKeys(uname);
	}
	
	public void setPasswrd(String passwrd) {
		wd.findElement(By.name("password")).clear();
		wd.findElement(pwd).sendKeys(passwrd);
	}
	
	public void clkLoginBtn() {
		wd.findElement(LoginBtn).click();
	}
	

	
}
