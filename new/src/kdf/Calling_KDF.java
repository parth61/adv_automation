package kdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling_KDF {

	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("./KDF_OHM.xlsx");
		
		XSSFWorkbook wk = new XSSFWorkbook(fi);
		XSSFSheet sh = wk.getSheet("Login_Keywords");     
		OHMRepository_KDF repo = new OHMRepository_KDF();
		for (int i = 1; i <= sh.getLastRowNum(); i++) 
		{
		XSSFRow rw = sh.getRow(i);
		String keywords = rw.getCell(1).toString();
		System.out.println(keywords);
		switch (keywords) {
		case "openBrwsr":
			repo.openBrwsr();
			break;
		case "openUrl":
			repo.openUrl();
			break;	
		case "setUname":
			repo.setUname();
			break;
		case "setPasswrd":
			repo.setPasswrd();
			break;
		case "clkLoginBtn":
			repo.clkLoginBtn();
			break;
		case "clkProfileLink":
			repo.clkProfileLink();
			break;
		case "clkLogout":
			repo.clkLogout();
			break;
		case "closeBrwsr":
			repo.closeBrwsr();
			break;
		

		default:
			System.out.println("error");
			break;
		}
		}
	}

}
