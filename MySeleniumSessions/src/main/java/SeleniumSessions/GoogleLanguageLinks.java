package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleLanguageLinks {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println("total lang links are " +langLinks.size() );
		
		
		for (WebElement e : langLinks) {
			String langText = e.getText();
			System.out.println(langText);
		}
	}
	

}
