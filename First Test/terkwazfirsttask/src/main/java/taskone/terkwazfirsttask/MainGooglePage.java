package taskone.terkwazfirsttask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainGooglePage {
	WebElement searchTextBox = null;
	WebElement searchRequest = null;
	
	public MainGooglePage(WebDriver driver) {
		searchTextBox = driver.findElement(By.xpath("//*[contains(@class,'gLFyf gsfi')]"));
		searchRequest = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	}
	
	public void EnterSearchRequest(String search){
		searchTextBox.sendKeys(search);
	}
	public void PressEnter(WebElement toEnter){
		toEnter.sendKeys(Keys.ENTER);
	}
	public void ClickSearch() /*throws InterruptedException*/{
		//Thread.sleep(1000);
		searchRequest.click();
	}
}
