package taskthree.terkwazthirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicLoadingPage {
	WebElement exampleTwoButton = null;
	
	public DynamicLoadingPage(WebDriver driver) {
		exampleTwoButton = driver.findElement(By.xpath("//*[contains(@href,'/dynamic_loading/2')]"));
	}
}
