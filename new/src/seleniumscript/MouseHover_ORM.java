package seleniumscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover_ORM {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\New Automation\\Webdrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		System.out.println("Title - "+wd.getTitle());
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Actions act = new Actions(wd);
		act.moveToElement(wd.findElement(By.linkText("My Info"))).perform();
		List<WebElement> menus = wd.findElements(By.xpath("//li[@class=\"oxd-main-menu-item-wrapper\"]/a"));
		System.out.println("Size - "+menus.size());
		System.out.println("1st element - "+menus.get(0).getText());
		System.out.println("Last element - "+menus.get(menus.size()-1).getText());
		int l=menus.size();
		System.out.println("List of elements -");
//		for (int i=0;i<l;i++)
//		{
//			System.out.println(menus.get(i).getText());
//			act.moveToElement(menus.get(i)).perform();
//			Thread.sleep(1000);
//			
//		}
		for (WebElement m:menus) {
			System.out.println(m.getText());
			act.moveToElement(m).perform();
			
			
		}
	}

}
