package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver wd ;
	
	@BeforeSuite
	private void openBrowser() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		
	}
  @Test
  public void f() throws Exception {
	  wd.navigate().to("https://www.selenium.dev");
	  Thread.sleep(2000);  
	  wd.findElement(By.linkText("Downloads")).click();
	  
  }
  
  
}
