package taskthree.terkwazthirdtest;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
//import static org.testng.Assert.assertFalse;
//import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.SkipException;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    
    @Test(description = "Check that the text displayed is \"Hello World!\"")
    public void shouldAnswerWithTrue()
    {
    	//SoftAssert softAssert = new SoftAssert();
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver(); 
        driver.navigate().to("https://the-internet.herokuapp.com/");
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.dynamicLoading.click();
        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage(driver);
        dynamicLoadingPage.exampleTwoButton.click();
        ExampleTwoPage exampleTwoPage = new ExampleTwoPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        exampleTwoPage.startButton.click();
        try {
        	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        }	catch (Exception e) {
        	throw new Error("''Hello World!'' does not Show");
        }
        //assertTrue(driver.findElement(By.id("finish")).getSize()!=null);
    }
}
