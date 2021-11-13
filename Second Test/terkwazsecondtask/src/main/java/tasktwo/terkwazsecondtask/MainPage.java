package tasktwo.terkwazsecondtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebElement fileUpload = null;
	
	public MainPage(WebDriver driver) {
		fileUpload = driver.findElement(By.xpath("//*[contains(@href,'/upload')]"));
	}
	
}
