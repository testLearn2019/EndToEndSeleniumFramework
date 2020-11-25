package reusables;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriverReusables {
	
	WebDriver driver;
	
	public WebDriverReusables(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterText(String id, String data) {
		driver.findElement(By.id(id)).sendKeys(data);
	}
	
	public void getScreenshot(String filenameWithExt) {
		File destination = new File("./Screenshots/" +filenameWithExt);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(image, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
