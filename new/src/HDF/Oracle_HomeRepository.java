package HDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Oracle_HomeRepository {
	WebDriver wd;
	public Oracle_HomeRepository(WebDriver wd) {
		this.wd = wd;
	}
	By LogoutBtn = By.xpath("//*[@id=\"wwvFlowForm\"]/a[4]");

	public void clkLogout() {
		wd.findElement(LogoutBtn).click();
	}

}
