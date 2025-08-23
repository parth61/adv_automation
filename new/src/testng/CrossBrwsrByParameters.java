package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrwsrByParameters {
	WebDriver wd;
	@Test
	@Parameters("browserName")
	public void f(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
			wd = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Web drivers\\geckodriver-v0.32.2-win32\\geckodriver.exe");
			wd = new FirefoxDriver();
		}
		wd.manage().window().maximize();
		wd.get("http://www.demo.frontaccounting.eu/");
		System.out.println(wd.getTitle());

	}
}
