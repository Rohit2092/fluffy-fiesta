package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*");
 		

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com/");
		
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 Thread.sleep(3000);
		 
			List<WebElement> sugList = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]/span"));
			
			for (WebElement e :sugList ) {
				String text = e.getText();
				System.out.println(text);
				if(text.equals("selenium testing")) {
					e.click();
					break;
				}
			}
		
		
		
		
	}

}
