package SeleniumSessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserUtil {
	
	static WebDriver driver;

	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("launching browser" + browserName);
	
	  
	switch (browserName.toLowerCase()) {
	case "chrome":
		driver = new ChromeDriver();
		break;
		
	case "firefox":
		driver = new FirefoxDriver();
		break;
		
	case "safari":
		driver = new SafariDriver();
		break;
		
	default:
		System.out.println("plz pass the right browser name...." + browserName);
		break;
	}

	return driver;

}
	
	public void launchUrl(String url) {
		driver.get(url);

	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	

	public static void main(String[] args) {
		
		
		
		
		
       
		}
		
		
		
	}
