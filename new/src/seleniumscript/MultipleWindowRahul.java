package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.PageFctry_Login;

public class MultipleWindowRahul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		PageFctry_Login lp = new PageFctry_Login(wd);
		wd.manage().window().maximize();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.get("https://www.rahulshettyacademy.com/AutomationPractice/");

	}

}
