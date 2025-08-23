package seleniumscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class DropDn_Alert_FA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("http://www.demo.frontaccounting.eu/");	
		Thread.sleep(1000);
		wd.findElement(By.cssSelector("body:nth-child(2) div:nth-child(2) form:nth-child(3) center:nth-child(4) > input:nth-child(1)")).click();
		wd.findElement(By.linkText("Sales Quotation Entry")).click();
		//wd.findElement(By.name("customer_id")).click();
		
		Select sel =new Select(wd.findElement(By.id("customer_id")));
//		sel.selectByIndex(3);
//		sel.selectByValue("51");
		sel.selectByVisibleText("ABC");
		wd.findElement(By.id("CancelOrder")).click();
		
		Alert al = wd.switchTo().alert();
		System.out.println("Text of alert"+al.getText());
		al.accept();  //for positive response
			
		Thread.sleep(5000);
		wd.close();

	}

}
