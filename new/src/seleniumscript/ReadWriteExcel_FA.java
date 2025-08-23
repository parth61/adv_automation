package seleniumscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.sdk.trace.samplers.ParentBasedSamplerBuilder;

public class ReadWriteExcel_FA {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		FileInputStream fi = new FileInputStream("./TestData.xlsx");
		
		XSSFWorkbook wk = new XSSFWorkbook(fi);
//		XSSFSheet sh = wk.getSheetAt(0);     //by index
		XSSFSheet sh = wk.getSheet("LoginData_FA");     //by sheet name
		XSSFRow rr = sh.getRow(0);
		XSSFCell uu = rr.getCell(0);
		XSSFCell pp = rr.getCell(1);
		System.out.println(uu+"\t"+pp);
		
		for (int i = 1; i <= sh.getLastRowNum(); i++) 
		{
		XSSFRow rw = sh.getRow(i);
		String un = rw.getCell(0).toString();
		String pwd = rw.getCell(1).toString();
		XSSFCell res = rw.createCell(2);    //create cell
		System.out.println(un+"\t"+pwd);
		
		wd.get("http://www.demo.frontaccounting.eu/");
		wd.findElement(By.name("user_name_entry_field")).clear();
//		wd.findElement(By.name("user_name_entry_field")).sendKeys(un.toString());
		wd.findElement(By.name("user_name_entry_field")).sendKeys(un);
		Thread.sleep(2000);
		wd.findElement(By.name("password")).clear();
		wd.findElement(	By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		wd.findElement(By.name("SubmitUser")).click();
		
		try {
			Thread.sleep(2000);
			wd.findElement(By.linkText("Logout")).click();
			System.out.println("Valid Credentials");
			res.setCellValue("Pass");
		}
		catch (Exception e) {
			System.err.println("Invalid Credentials");
			Thread.sleep(2000);
			TakesScreenshot ts = (TakesScreenshot) wd;
			File sf = ts.getScreenshotAs(OutputType.FILE);
			String ss = "password";
			if (pwd.equals(ss)) {
				File df = new File("./"+un+".png");
				FileHandler.copy(sf, df);
			} else {
				File df = new File("./"+pwd+".png");
				FileHandler.copy(sf, df);
			}
//			File df = new File("./"+un+".png");
//			FileHandler.copy(sf, df);
			res.setCellValue("Fail");
		}
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("./TestData.xlsx");
		wk.write(fo);

	}

}
