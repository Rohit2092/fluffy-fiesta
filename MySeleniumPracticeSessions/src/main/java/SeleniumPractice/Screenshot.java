package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		takescreenshot("google ss");
		
		//driver.close();

	}
	
	public static void takescreenshot(String fileName) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
FileUtils.copyFile(file, new File("/Users/rohitkumar/eclipse-workspace/MySeleniumPracticeSessions/Screenshot" + fileName + ".jpg"));		
		
	}

}
