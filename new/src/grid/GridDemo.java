package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
  @Test
  public void f() throws Exception 
  {
	  String nodeUrl = " http://192.168.51.16:45805/wd/hub";  // http://192.168.108.16:5555- new syntax
	  DesiredCapabilities cap = DesiredCapabilities.chrome(); // DesiredCapabilities.firefox(); - old syntax
	  cap.setBrowserName("chrome");
	  cap.setPlatform(Platform.WINDOWS);
	 	  
	  WebDriver wd = new RemoteWebDriver(new URL(nodeUrl), cap);  //old syntax
	  wd.get("https://blazedemo.com");
 
  }
}
