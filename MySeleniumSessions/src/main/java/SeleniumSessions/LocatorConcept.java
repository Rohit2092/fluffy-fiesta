package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(co);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// ElementUtil elUtil = new ElementUtil(driver);

		// By emailId = By.name("email");

		// elUtil.doSendKeys(emailId, "rhtkmr379@gmail.com");

		// xpath .

		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("anu@123");
	}

}
