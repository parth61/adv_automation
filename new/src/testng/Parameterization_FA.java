package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Parameterization_FA {
	
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://www.demo.frontaccounting.eu/");
		wd.findElement(By.name("user_name_entry_field")).clear();
		wd.findElement(By.name("user_name_entry_field")).sendKeys(n);
		Thread.sleep(2000);
		wd.findElement(By.name("password")).clear();
		wd.findElement(	By.name("password")).sendKeys(s);
		Thread.sleep(2000);
		wd.findElement(By.name("SubmitUser")).click();
		try {
			Thread.sleep(2000);
			wd.findElement(By.linkText("Logout")).click();
		}
		catch (Exception e) {
			wd.close();
		}
		wd.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demouser", "password" },
      new Object[] { "demoser", "passord" },
      new Object[] { "demouser", "password" },
    };
  }
}
