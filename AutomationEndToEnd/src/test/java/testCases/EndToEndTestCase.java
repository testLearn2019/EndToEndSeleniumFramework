package testCases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SystemUsers;

public class EndToEndTestCase extends BaseClass{
	
	@Test
	public void runnerTest() {
		LoginPage login = new LoginPage(driver);
		login.login();
		HomePage home = new HomePage(driver);
		home.adminMenu();
		SystemUsers users = new SystemUsers(driver);
		users.searchUser();
	}
	
	
	
	

}
