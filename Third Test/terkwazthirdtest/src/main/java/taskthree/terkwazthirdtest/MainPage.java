package taskthree.terkwazthirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebElement dynamicLoading = null;
	
	public MainPage(WebDriver driver) {
		dynamicLoading = driver.findElement(By.xpath("//*[contains(@href,'/dynamic_loading')]"));
	}
	
}
