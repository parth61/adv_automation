package home;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class OHMPractise {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		wd.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		wd.findElement(By.linkText("Leave")).click();
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[3]/span[1]/i[1]")).click();
		wd.findElement(By.linkText("Add Entitlements")).click();
		wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/span[1]")).click();


		try {
			Boolean Display = wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]")).isDisplayed();
			System.out.println(Display);
		} catch (Exception e) {
			System.out.println("Element not present");
		}
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[1]")).click();

		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();

		FileInputStream fi = new FileInputStream("./test.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		XSSFSheet dsh = wk.getSheet("1");
		
		
		try {
			
		for (int i = 1; i <= dsh.getLastRowNum(); i++) 
		{
			XSSFRow drw = dsh.getRow(i);
			String fn = drw.getCell(0).toString();
			String mn = drw.getCell(1).toString();
			String ln = drw.getCell(2).toString();
			String id = drw.getCell(3).toString();

			System.out.println(fn+"\t"+mn+"\t"+ln+"\t"+id);
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(fn);
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys(mn);
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys(ln);
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(id);
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();	
			
			
		}
			
		}
		catch (Exception e) {
			wd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]")).click();
		}
		}

	}


