package taskone.terkwazfirsttask;

//import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    
    @Test(description = "Check that the third result text contains \"What is Selenium WebDriver?\" ")
    public void shouldAnswerWithTrue()
    {
    	//SoftAssert softAssert = new SoftAssert();
    	WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(); 
        driver.navigate().to("https://www.google.com/ncr");
        MainGooglePage searchPage = new MainGooglePage(driver);
        driver.manage().window().maximize();
        searchPage.EnterSearchRequest("selenium webdriver");
        searchPage.ClickSearch();
        //searchPage.PressEnter(searchPage.searchRequest);                  or we can press enter
        //System.out.println(resultsPage.searchResultText.getText());
		//assertTrue(resultsPage.searchResultText.getText().contains("Selenium"), "Text one not found");
        ResultsPage resultsPage = new ResultsPage(driver);
        if(!(resultsPage.searchResultText.getText().contains("What is Selenium WebDriver?")))
        throw new Error("Text not found");
        //softAssert.assertAll();
        //What is Selenium WebDriver?
        //"Text not found"
    }
}
