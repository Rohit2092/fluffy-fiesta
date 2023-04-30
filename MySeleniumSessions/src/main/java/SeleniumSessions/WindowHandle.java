package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		WebElement linkedinlink= driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		linkedinlink.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		System.out.println(parentWindow);
		
		String childWin = it.next();
		System.out.println(childWin);
		
		driver.switchTo().window(childWin);
		System.out.println(driver.getCurrentUrl());
		driver.close(); // it will only close the child window but quit will close both the window
		
		/// switch back to parent window 
		
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		

		
	}

}
