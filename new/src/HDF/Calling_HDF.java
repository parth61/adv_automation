package HDF;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling_HDF {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		FileInputStream fi = new FileInputStream("./HDF_FA.xlsx");
		FA_HomeRepository home = new FA_HomeRepository(wd);
		FA_LoginRepository login = new FA_LoginRepository(wd);

		@SuppressWarnings("resource")
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		XSSFSheet dsh = wk.getSheet("Test_Data");  
		XSSFSheet ksh = wk.getSheet("Login_Keywords"); 
		for (int i = 1; i <= dsh.getLastRowNum(); i++) 
		{
			XSSFRow drw = dsh.getRow(i);
			String un = drw.getCell(0).toString();
			String pwd = drw.getCell(1).toString();
			XSSFCell res = drw.createCell(2);
			System.out.println(un+"\t"+pwd);

			try {
				for (int j = 1; j <= ksh.getLastRowNum(); j++) 
				{
					XSSFRow krw = ksh.getRow(j);
					String keywords = krw.getCell(1).toString();
					//System.out.println(keywords);
					switch (keywords) {
					case "openUrl":
						login.openUrl();
						break;	
					case "setUname":
						login.setUname(un);
						break;
					case "setPasswrd":
						login.setPasswrd(pwd);
						break;
					case "clkLoginBtn":
						login.clkLoginBtn();
						break;
					case "clkLogout":
						home.clkLogout();
						break;

					default:
						System.out.println("Invalid Keyword");
						break;

					}
				}
				System.out.println("PASS");
				res.setCellValue("Pass");
			}
			catch (Exception e) {
				System.out.println("FAIL");
				res.setCellValue("Fail");
			}
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("./HDF_FA.xlsx");
		wk.write(fo);
		
		wd.close();
	}
}