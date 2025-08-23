package seleniumscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindRahulShetty {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.get("https://www.rahulshettyacademy.com/AutomationPractice/");


		Thread.sleep(2000);
		wd.findElement(By.id("openwindow")).click();
		Thread.sleep(2000);
		String pid = wd.getWindowHandle(); 
		System.out.println(pid);


		Set<String> allwin = wd.getWindowHandles();
		for (String wind : allwin) {
			wd.switchTo().window(wind);
			System.out.println(wd.getTitle());
			if (!(wind.equals(pid))) {
				Thread.sleep(4000);
				Actions act = new Actions(wd);
				wd.findElement(By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
				act.moveToElement(wd.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[2]/a"))).click().perform();				
				wd.close();
			}
		}

		wd.switchTo().window(pid);
		Thread.sleep(3000);
		wd.findElement(By.id("opentab")).click();
		Object [] alltab = wd.getWindowHandles().toArray();
		for (Object tab : alltab) {
			wd.switchTo().window(tab.toString());
			System.out.println(wd.getTitle());
			if (!(tab.equals(pid))) {
				Thread.sleep(4000);
				Actions act = new Actions(wd);
				JavascriptExecutor js = (JavascriptExecutor) wd;
				WebElement join = wd.findElement(By.xpath("/html/body/div/section/div/div/div[2]/div/a"));
				js.executeScript("arguments[0].scrollIntoView()", join);
				Thread.sleep(3000);
				act.moveToElement(join).perform();	


			}
		}

		Thread.sleep(3000);
		wd.quit();

	}



}
