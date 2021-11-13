package tasktwo.terkwazsecondtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoneUploadingPage {
	WebElement doneUpload = null;
	
	public DoneUploadingPage(WebDriver driver) {
		doneUpload = driver.findElement(By.id("uploaded-files"));
	}
}
