package seleniumscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframedemo_RS {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		WebElement frame = wd.findElement(By.id("courses-iframe"));
		js.executeScript("arguments[0].scrollIntoView()", frame);
		
//		wd.switchTo().frame(0);   //by index
		
//		wd.switchTo().frame("courses-iframe");   //by id
		
//		wd.switchTo().frame("iframe-name");   //by name
		
		wd.switchTo().frame(frame);
		Thread.sleep(2000);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Courses")));
		Actions act = new Actions(wd);
		act.moveToElement(wd.findElement(By.linkText("Courses"))).perform();
		System.out.println(wd.findElement(By.linkText("Courses")).getText());
		Thread.sleep(2000);
		
//		wd.switchTo().parentFrame();   //parent
		wd.switchTo().defaultContent();   //default
		wd.findElement(By.id("mousehover")).click();
		Thread.sleep(4000);
		wd.close();

	}

}
