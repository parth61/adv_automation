package HDF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingOracle {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parth", "parth");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Login_Data");


		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Web drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		Oracle_HomeRepository home = new Oracle_HomeRepository(wd);
		Oracle_LoginRepository login = new Oracle_LoginRepository(wd);
		while (rs.next()) 
		{
			String un = rs.getString(1);
			String pwd = rs.getString("passwd");
			System.out.println(un+"\t"+pwd);

			try {
				ResultSet key = st.executeQuery("select * from Login_Keywords");
				while (key.next()) 
				{
					String keywords = key.getString(1);
					System.out.println(keywords);
					switch (keywords) {
					case "openUrl":
						login.openUrl();
						break;	
					case "SetUname":
						login.SetUname(un);
						break;
					case "SetPasswrd":
						login.SetPasswrd(pwd);
						break;
					case "clkLogin":
						login.clkLogin();
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
			}
			catch (Exception e) {
				System.out.println("FAIL");	
			}
		}
	}
}




