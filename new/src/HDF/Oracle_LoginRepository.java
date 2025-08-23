package HDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oracle_LoginRepository {
	WebDriver wd;
	public Oracle_LoginRepository(WebDriver wd) {
		this.wd = wd;
	}
	By un = By.name("p_t01");
	By pwd = By.name("p_t02");
	By LoginBtn = By.id("LOGIN");

	public void openUrl() {
		wd.get("http://127.0.0.1:8080/apex/f?p=4550:11:3915700197221063::NO:::");	
	}

	public void SetUname(String uname) {
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(un));
		wd.findElement(un).clear();
		wd.findElement(un).sendKeys(uname);
	}

	public void SetPasswrd(String passwrd) {
		wd.findElement(By.name("p_t02")).clear();
		wd.findElement(pwd).sendKeys(passwrd);
	}

	public void clkLogin() {
		wd.findElement(LoginBtn).click();
	}

}
