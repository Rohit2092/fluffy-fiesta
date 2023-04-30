package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		 driver = new ChromeDriver(co);
		
		driver.get("https://www.spicejet.com/");
		
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		
		By childMenu = By.xpath("//div[text()='Friends and Family']");
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
		 
	}
		public static void clickOnSubMenu(String parentMenu, String childMenu) {
		
		}
		
		
		
		
		
		
	}


