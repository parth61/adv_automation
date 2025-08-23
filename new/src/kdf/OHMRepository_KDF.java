package kdf;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHMRepository_KDF 
{
	WebDriver wd;
//	public OHMRepository_KDF(WebDriver wd) {
//		this.wd = ;
//	}
	
	By un = By.name("username");
	By pwd = By.name("password");
	By login = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
	By detail = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
	By logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	
	//repo of methods
	public void openBrwsr() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public void openUrl() {
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void setUname() {
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(un));
		wd.findElement(un).sendKeys("Admin");
	}
	
	public void setPasswrd() {
		wd.findElement(pwd).sendKeys("admin123");
	}
	
	public void clkLoginBtn() {
		wd.findElement(login).click();
	}
	
	public void clkProfileLink() {
		wd.findElement(detail).click();
	}
	
	public void clkLogout() {
		wd.findElement(logout).click();
	}
	
	public void closeBrwsr() {
		wd.close();
	}
}
