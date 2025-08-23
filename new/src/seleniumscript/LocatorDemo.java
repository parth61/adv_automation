package seleniumscript;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		
		// //tagname[@attribute name=value of attribute]
		//wd.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		
		//classname locator
		wd.findElement(By.className("oxd-userdropdown-tab")).click();
		
		//logout link by link text editor	
		wd.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(5000);
		wd.close();
		}

}
