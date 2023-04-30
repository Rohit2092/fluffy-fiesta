package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TotalLinks {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https:amazon.com");

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		System.out.println(linklist.size());

		// for (int i=0; i<linklist.size();i++) {
		// String list = linklist.get(i).getText();
		// System.out.println(list);
		// if(!(list.length()==0)) {
		// System.out.println(i + "=" +list);
		// }
		// }

		// for each loop

		for (WebElement e : linklist) {
			String text = e.getText();
			System.out.println(text);

			if (!(text.length() == 0)) {
				System.out.println(text);
			}

		}

	}

}
