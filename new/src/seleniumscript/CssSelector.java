package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		System.out.println("Title - "+wd.getTitle());
		Thread.sleep(2000);
		
		//cssSelector
		//tagname[attribute=value]
		wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		wd.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		wd.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		//tagname.classname
		wd.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(5000);
		wd.close();
		
		
		
	
		

	}

}
