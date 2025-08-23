package testng;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenApps {
	WebDriver wd;
	@BeforeClass
	private void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
	}
	@Test
	public void openBlazeDemo() {
		wd.navigate().to("https://blazedemo.com/");	
	}
	@Test
	public void openOHM() {
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	@AfterSuite
	private void closeBrowser() throws Exception {
		Thread.sleep(2000);
		wd.close();
	}
}
