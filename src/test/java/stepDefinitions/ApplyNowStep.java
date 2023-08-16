package stepDefinitions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pages.ApplyNowPage;
import utilities.Driver;

public class ApplyNowStep {

    WebDriver driver= Driver.getDriver();
    ApplyNowPage anPage = new ApplyNowPage();
    
    
    @When("user clicks “Apply Now” for card type: Secured Credit Card")
    public void user_clicks_Apply_Now_for_card_type_Secured_Credit_Card() throws InterruptedException {
    	anPage.applyNow.click();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    
    }

}