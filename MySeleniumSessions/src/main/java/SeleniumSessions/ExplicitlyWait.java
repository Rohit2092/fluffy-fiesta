package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		By macbook = By.linkText("MacBook");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// WebElement mac_ele =
		// wait.until(ExpectedConditions.presenceOfElementLocated(macbook));

		// mac_ele.click();

		waitForElementPresense(macbook, 10);

	}

	public static WebElement waitForElementPresense(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
