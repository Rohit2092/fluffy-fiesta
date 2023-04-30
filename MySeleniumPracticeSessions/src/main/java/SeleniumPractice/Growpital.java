package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growpital {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://app.growpital.com/login");

		driver.manage().deleteAllCookies();

		driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));

		emailId.clear();

		emailId.sendKeys("rhtkmr379@gmail.com");

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.clear();
		pwd.sendKeys("Rohit@123");

		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'custom-button')]"));

		loginButton.click();

		WebElement userName = driver.findElement(By.xpath("//div[@class='user-name']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", userName);

		WebElement viewProfile = driver.findElement(By.xpath("//span[normalize-space()='View Profile']"));

		js.executeScript("arguments[0].click();", viewProfile);

		WebElement bankTab = driver.findElement(By.xpath("//div[normalize-space()='Upload Documents']"));

		js.executeScript("arguments[0].click();", bankTab);
		
		WebElement uploadLink = driver.findElement(By.xpath("//div[4]//div[1]//div[1]//input[1]"));
		
		js.executeScript("arguments[0].click();", uploadLink);

		
		

	}

}
