package grid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo2 {

	@Test
	  public void f() throws Exception 
	  {
		  String nodeUrl = "http://192.168.51.16:5566/wd/hub";  // http://192.168.108.16:5555- new syntax
		  DesiredCapabilities cap = DesiredCapabilities.edge(); // DesiredCapabilities.firefox(); - old syntax
		  cap.setBrowserName("edge");
		  cap.setPlatform(Platform.WINDOWS);
		 	  
		  WebDriver wd = new RemoteWebDriver(new URL(nodeUrl), cap);  //old syntax
		  wd.get("https://blazedemo.com");
	 
	  }

}
