package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void adminMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).
		moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).
		moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();
	}

}
