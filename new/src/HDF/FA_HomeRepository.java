package HDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FA_HomeRepository {
	WebDriver wd;
	public FA_HomeRepository(WebDriver wd) {
		this.wd = wd;
	}
	By LogoutBtn = By.linkText("Logout");
	
	public void clkLogout() {
		wd.findElement(LogoutBtn).click();
	}
}
