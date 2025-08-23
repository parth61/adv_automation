package pom;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Calling_PageFctry {
	
// null pointer exception we don't create constructor for wd

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		PageFctry_Login lp = new PageFctry_Login(wd);
		wd.manage().window().maximize();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.get("http://www.demo.frontaccounting.eu/index.php");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String un = sc.next();
		lp.setUn(un);
		System.out.println("Enter password");
		String pwd = sc.next();
		lp.setPwd(pwd);
		Thread.sleep(2000);
		lp.clkLogin();
		Thread.sleep(2000);
//		wd.findElement(By.linkText("Sales Quotation Entry")).click();
//		Thread.sleep(2000);
//		lp.clkCancelOrder();
		lp.clkLogout();
		
		
		
	}

}
