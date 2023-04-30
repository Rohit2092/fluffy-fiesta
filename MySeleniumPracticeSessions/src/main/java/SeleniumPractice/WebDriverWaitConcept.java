package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWaitConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	}

}
