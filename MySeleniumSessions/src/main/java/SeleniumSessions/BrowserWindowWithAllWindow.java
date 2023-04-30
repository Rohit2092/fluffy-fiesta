package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentWin= driver.getWindowHandle();
		
		
		Thread.sleep(5000);
		
		WebElement lnkd_ele= driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement twt_ele= driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fb_ele= driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement yt_ele= driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		lnkd_ele.click();
		twt_ele.click();
		fb_ele.click();
		yt_ele.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId= it.next();
			driver.switchTo().window(windowId);
			String currentTitle = driver.getTitle();
			System.out.println(currentTitle);
			Thread.sleep(2000);
			
			if(!windowId.equals(parentWin)) {
				driver.close();
			}
			
			driver.switchTo().window(parentWin);
		}
		
	}

}
