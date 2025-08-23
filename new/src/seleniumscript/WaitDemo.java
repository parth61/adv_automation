package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		System.out.println("Title - "+wd.getTitle());
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");

	}

}
