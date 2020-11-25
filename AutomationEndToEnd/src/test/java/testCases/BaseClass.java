package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import reusables.GlobalReusables;

public class BaseClass {
	
	static WebDriver driver;

	@BeforeMethod
	public void testStatus() {
		int i = 0;
		System.out.println("Test " +i + "initialised");
	}
	
	@BeforeSuite
	public static void browserSetup () {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		GlobalReusables globreuse = new GlobalReusables();
		driver.get(globreuse.readProperties("baseURL"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterTest() {
		int i = 1;
		System.out.println("Test " +i + "ended");
	}
	
	@AfterSuite
	public void browserClose () {
		driver.close();
	}
	
}
