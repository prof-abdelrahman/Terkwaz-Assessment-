package taskthree.terkwazthirdtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExampleTwoPage {
	WebElement startButton = null;
	
	public ExampleTwoPage(WebDriver driver) {
		startButton = driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
	}
}
