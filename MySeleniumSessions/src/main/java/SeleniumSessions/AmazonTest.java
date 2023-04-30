package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		String browserName = "Chrome";

		br.launchBrowser(browserName);

		br.launchUrl("https:amazon.in");

	}

}
