package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	static WebDriver wd;

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		prop.load(new FileInputStream("./settings.properties"));

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to(prop.getProperty("url"));
		getlocator(prop.getProperty("username")).clear();
		getlocator(prop.getProperty("username")).sendKeys("demouser");
		getlocator(prop.getProperty("password")).clear();
		getlocator(prop.getProperty("password")).sendKeys("password");
		getlocator(prop.getProperty("login")).click();
		Thread.sleep(5000);
		getlocator(prop.getProperty("logout")).click();

	}

	public static WebElement getlocator(String element) {
		WebElement e =null;
		String locValue = element.split(":=")[0];
		String locType = element.split(":=")[1];

		if (locType.equalsIgnoreCase("id")) 
		{
			e=wd.findElement(By.id(locValue));
		} 
		else if (locType.equalsIgnoreCase("name")) 
		{
			e=wd.findElement(By.name(locValue));
		} 
		else if (locType.equalsIgnoreCase("linktext")) 
		{
			e=wd.findElement(By.linkText(locValue));
		} 
		else 
		{
			System.out.println("invalid Locator");
		}

		return e;
	}
}
