package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBasics {

	public static void main(String[] args) {

 //System.setProperty("webdriver.chrome.driver","/Users/rohitkumar/Downloads/chromedriver_mac_arm64/chromedriver");
 		//ChromeOptions co = new ChromeOptions();
 		//co.addArguments("--remote-allow-origins=*");
 		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//validation point 
		
		if (title.equals("Amazon.com. Spend less. Smile more.")){
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title ");
		}
		
		driver.close();


	}

}
