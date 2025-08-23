package seleniumscript;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.HomePageRepository;
import pom.LoginPageRepository;

public class CallingLoginPage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String un = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		LoginPageRepository lo = new LoginPageRepository(wd);
		lo.LoginProcess(un, pwd);
		HomePageRepository home = new HomePageRepository(wd);
		home.logoutprocess();

	}

}
