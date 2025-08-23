package seleniumscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoScript 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Automation\\Web drivers\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver wd = new ChromeDriver(); //used to open blank browser instance
		//WebDriver ed = new EdgeDriver();
		
		//wd.get("http://www.demo.frontaccounting.eu/"); // used to open app url in opened browser instance
		wd.navigate().to("https://blazedemo.com/");	
		
		wd.close();

	}


}
