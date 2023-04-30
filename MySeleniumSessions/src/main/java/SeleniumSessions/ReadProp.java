package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null ;
		

		//crate the object of properties class 
		Properties prop = new Properties ();
		//create the object of FileInputStream class 
		
		FileInputStream ip = new FileInputStream("/Users/rohitkumar/eclipse-workspace/"
				+ "MySeleniumSessions/src/main/java/SeleniumSessions/config.properties");
		
		prop.load(ip); //  making the connection between properties file and java code 
		
		//System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			 driver = new ChromeDriver();
			 
		}
		else if (browserName.equals("ff")) {
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		
		else {
			System.out.println("please pass the correct browser");
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}

}
