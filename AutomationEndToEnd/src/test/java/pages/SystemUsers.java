package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SystemUsers {
	
	WebDriver driver;
	
	public SystemUsers(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchUser() {
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aaliyah.Haq");
		Select userRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userRole.selectByVisibleText("ESS");
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Aaliyah Haq");
		Select status = new Select(driver.findElement(By.id("searchSystemUser_status")));
		status.selectByVisibleText("Enabled");
		driver.findElement(By.id("searchBtn")).click();
	}
	
	public void addUser() {
		
	}
}
