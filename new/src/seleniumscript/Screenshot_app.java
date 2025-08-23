package seleniumscript;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot_app {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) wd;
		File sf = ts.getScreenshotAs(OutputType.FILE);
		File df = new File("./scr2.png");
		FileHandler.copy(sf, df);
		
	}

}
