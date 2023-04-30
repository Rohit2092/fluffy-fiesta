package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSession {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains']")).click();
		
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("patna");
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("delhi");
		
		
	}

}
