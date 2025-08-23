package testng;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OHM {
	WebDriver wd;
	@BeforeSuite
	private void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeClass
	private void login() throws InterruptedException {
//		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Thread.sleep(5000);
		wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}
	
	@Test
	public void leave() {
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();

	}
	
	@Test
	public void recruitment() {
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
	}

	@AfterTest
	private void logout() {
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	}
	
	@AfterSuite
	private void closeBrowser() {
		wd.close();
	}
}

