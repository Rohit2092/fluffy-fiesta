package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TopCastingOptions {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "Chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		}

		else if (browser.equals("FF")) {
			driver = new FirefoxDriver();

		}

		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the right browser");
		}

		driver.get("https://google.com");

	}

}
