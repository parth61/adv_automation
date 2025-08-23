package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver wd = new ChromeDriver();
	 wd.get("http://www.demo.frontaccounting.eu/");
	 
	 System.out.println(wd.getTitle());
	 System.out.println(wd.getPageSource());
	 
	int i = 5;
	System.out.println(i);
	}

}
