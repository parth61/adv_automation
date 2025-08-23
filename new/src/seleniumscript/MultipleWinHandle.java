package seleniumscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.PageFctry_Login;

public class MultipleWinHandle {

	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\webdrivers\\chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		PageFctry_Login lp = new PageFctry_Login(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.get("http://www.demo.frontaccounting.eu/index.php");
		
		lp.clkLogin();
		Thread.sleep(2000);
		wd.findElement(By.linkText("Sales Quotation Entry")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/a")).click();
		 
	//getWindowHandle()- predefined method of webdriver interface
	//used to capture id of parent window
	//return type is string
		String pid = wd.getWindowHandle(); 
		System.out.println(pid);
		
	//getWindowHandle()- predefined method of webdriver interface
	//used to capture id of all opened windows	
	//return type is Set<string>
		Set<String> allwin = wd.getWindowHandles();

	}

}
