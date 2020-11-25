package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusables.GlobalReusables;
import reusables.WebDriverReusables;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver driver) {
		ldriver=driver;
	}

	public void login() {
		WebDriverReusables reuse = new WebDriverReusables(ldriver);
		GlobalReusables globreuse = new GlobalReusables();
		
		//ldriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		reuse.enterText(globreuse.readProperties("usernameProp"), globreuse.readExcel("Sheet1", 0, 0));
		reuse.enterText(globreuse.readProperties("passwordProp"), globreuse.readExcel("Sheet1", 0, 1));
		
		
		//ldriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		ldriver.findElement(By.id(globreuse.readProperties("logButtobProp"))).click();
		
		reuse.getScreenshot("LoginError.png");
	}
	
}
