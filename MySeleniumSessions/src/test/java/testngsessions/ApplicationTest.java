package testngsessions;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {
	
	//global pre condition 
	// pre condition 
	//test
	//validation 
	//post step 
	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("DB--connect ");

}
	@BeforeTest
	public void createUser() {
		System.out.println("create user ");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch browser  ");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login ");
	}
	
	@Test 
	public void homePageTest(){
		System.out.println("homepageTest ");
	}

	@Test 
	public void cartPageTest(){
		System.out.println("cartpageTest ");
	}

	@Test 
	public void searchPageTest(){
		System.out.println("searchpageTest ");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser ");
	}
	
	@AfterTest 
	
	public void deleteUser() {
		System.out.println("delete user ");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("disconnect with DB");
	}
	
	
	
	
	
	
	
	
	
	
}