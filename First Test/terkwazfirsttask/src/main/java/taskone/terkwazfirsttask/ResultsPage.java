package taskone.terkwazfirsttask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	WebElement searchResultText = null;
	
	public ResultsPage(WebDriver driver) {
		searchResultText = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div/div[2]/div/span[2]"));
	}
	/*public boolean CheckTest() {
		if(searchResultText.getText().equalsIgnoreCase("What is Selenium WebDriver?"))
			return true;
		else
			return false;
	}*/
}
