package seleniumscript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DBTesting {

	public static void main(String[] args) throws Exception 
	{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parth", "parth");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from testdata");
		//		int i = st.executeUpdate("insert into testdata values('Admin1','admin')");

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		while (rs.next()) 
		{
			String un = rs.getString(1);
			String pwd = rs.getString("passwd");

			System.out.println(un+"\t"+pwd);
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys(un);
			wd.findElement(By.name("password")).sendKeys(pwd);
			wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			try 
			{
				wd.findElement(By.cssSelector(".oxd-spanuserdropdown-tab")).click();
				wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
				System.out.println("Valid");
			} 
			catch (Exception e) 
			{
				System.out.println("Invalid");
			}
			Thread.sleep(2000);
		}
	}

}
