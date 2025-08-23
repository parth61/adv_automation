package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageRepository {
	WebDriver wd;
	public HomePageRepository(WebDriver wd) {
		this.wd = wd;
	}
	By detail = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
	By logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	
	public void logoutprocess ()
	{
		wd.findElement(detail).click();
		wd.findElement(logout).click();
	}

}
