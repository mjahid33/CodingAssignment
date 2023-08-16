package stepDefinitions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.SkipPage;
import utilities.Driver;

public class SkipStep {

    WebDriver driver= Driver.getDriver();
    SkipPage sPage = new SkipPage();
    
    @Then("user skips the pre-fill step")
    public void user_skips_the_pre_fill_step() {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 250)");
    	sPage.skip.click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
       
    }

}
