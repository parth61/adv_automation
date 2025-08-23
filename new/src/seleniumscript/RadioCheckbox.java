package seleniumscript;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioCheckbox {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wt = new WebDriverWait(wd, Duration.ofSeconds(10));
		wd.manage().window().maximize();
		wd.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"radio1\"]")));
//		wd.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		
//		wt.until(ExpectedConditions.visibilityOfAllElements(wd.findElements(By.name("radiobutton"))));
		
		List<WebElement> radio = wd.findElements(By.name("radiobutton"));
		
		for (WebElement w : radio) {
			Thread.sleep(1000);
			boolean s = w.isDisplayed();
			if (s==true) 
			{
			w.click();
			}
			else {
				System.out.println(w.getText()+" is not visible");
			}
		}
		
////		List<WebElement> chckbx = wd.findElements(By.xpath("//body[1]/div[1]/div[4]/fieldset[1]/label/input"));
//		 	for (WebElement c : ) {
//			
//		}
		
		boolean st = wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).isDisplayed();
		System.out.println("Status - "+st);
		if (st==true) {
			System.out.println("Element is visible");
			wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[2]/input[1]")).click();
		} else {
			System.out.println("Element is not visible");
		}
		
		boolean chk = wd.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(chk);
		
		if (chk==false)
			wd.findElement(By.id("checkBoxOption1")).click();
		else
			System.out.println("Checked box is checked");
		
		boolean be = wd.findElement(By.id("opentab")).isEnabled();
		
		System.out.println(be);
		
		
	}

}
