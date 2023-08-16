package stepDefinitions;
import io.cucumber.java.en.*;
import pages.AssertPage;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class AssertStep {

    WebDriver driver= Driver.getDriver();
    AssertPage aPage = new AssertPage();
    
   @Then("user verifies that the APR for Cash Advances is greater than {int}%")
    public void user_verifies_that_the_APR_for_Cash_Advances_is_greater_than(Integer int1) {
	   
		
   	   JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0, 250)");
	   
	   String aprText = aPage.validateAPR.getText();
       String percentageValue = aprText.split("%")[0].trim();

       double aprPercentage = Double.parseDouble(percentageValue);

       Assert.assertTrue(aprPercentage > 20.0);
       
       driver.quit();

     }

}
