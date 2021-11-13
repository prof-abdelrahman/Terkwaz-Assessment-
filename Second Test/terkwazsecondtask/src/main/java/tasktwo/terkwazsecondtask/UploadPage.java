package tasktwo.terkwazsecondtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	WebElement chooseFile = null;
	WebElement uploadButton = null;
	
	public UploadPage(WebDriver driver) {
		chooseFile = driver.findElement(By.id("file-upload"));
		uploadButton = driver.findElement(By.id("file-submit"));
	}
}
