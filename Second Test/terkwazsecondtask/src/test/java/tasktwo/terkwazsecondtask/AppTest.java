package tasktwo.terkwazsecondtask;

//import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    
    @Test(description = "Check that the file has been uploaded successfully")
    public void shouldAnswerWithTrue()
    {
    	//SoftAssert softAssert = new SoftAssert();
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver(); 
        driver.navigate().to("https://the-internet.herokuapp.com/");
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.fileUpload.click();
        UploadPage uploadPage = new UploadPage(driver);
        //D:\\Eclipse\\Terkwaz\\red flower.jpg
        try
        {
        	uploadPage.chooseFile.sendKeys("D:\\Eclipse\\Terkwaz\\Second Test\\red flower.jpg");
        }
        catch(Exception e)
        {
        	System.out.println("file has not been Uploaded Successfully");
        }
        uploadPage.uploadButton.click();
        
        //System.out.println(doneUploadingPage.doneUpload.getSize());
        try {
        	DoneUploadingPage doneUploadingPage = new DoneUploadingPage(driver);
        	doneUploadingPage.doneUpload.getSize();
        }
        catch (Exception e) {
        	 throw new Error("Nothing has been Uploaded Successfully");
        }
    }
}
