package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(co);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.name("email")).sendKeys("rhtkmr379@gmail.com");
		driver.findElement(By.name("password")).sendKeys("rohit123");

		// 2nd method

		WebElement emailId = driver.findElement(By.id("input-email"));

		WebElement pwd = driver.findElement(By.id("input-password"));

		emailId.sendKeys("rohit@gmail.com");
		pwd.sendKeys("rohit123");

		// By locator approach--3rd approach

		By emailId1 = By.id("input-email");
		By pwd1 = By.id("input-password");

		WebElement emailId_ele = driver.findElement(emailId1);
		WebElement pwd_ele = driver.findElement(pwd1);
		emailId_ele.sendKeys("rhtkmr");
		pwd_ele.sendKeys("123");
		
		getElement(emailId1).sendKeys("tom@gmail.com");
		
		getElement(pwd1).sendKeys("tom@123");

		
				
	}
	
	// By locator + Generic method 
	
	By emailId1 = By.id("input-email");
	By pwd1 = By.id("input-password");
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	// another approach 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
