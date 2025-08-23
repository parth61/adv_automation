package seleniumscript;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Browser \n1. Chrome \n2. Firefox");
		int num = sc.nextInt();
		WebDriver wd=null;
		switch (num)
		{
			case 1:
				System.setProperty("webdriver.chrome.driver", "D:\\Automation\\webdrivers\\chromedriver\\chromedriver.exe");
				wd = new ChromeDriver();
				
			break;
			case 2:
				System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Web drivers\\geckodriver-v0.32.2-win32\\\\geckodriver.exe");
				wd = new FirefoxDriver();
				
			break;
			default:
				System.out.println("Enter Valid input");
			
		}
		if (wd!=null)
			{
			wd.get("http://www.demo.frontaccounting.eu/");
			//wd.close();
			}

	}
}

//	public static void main(String[] args) throws Exception
//		{
//			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
//			WebDriver wd = new ChromeDriver();
//			wd.manage().window().maximize();
//			wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
//			System.out.println("Title - "+wd.getTitle());
//			Thread.sleep(2000);
//			
//			//cssSelector
//			//tagname[attribute=value]
//			wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
//			wd.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
//			wd.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//
//}
