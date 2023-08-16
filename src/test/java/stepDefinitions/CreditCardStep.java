package stepDefinitions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import pages.CreditCardPage;
import utilities.Driver;

public class CreditCardStep {

    WebDriver driver= Driver.getDriver();
    CreditCardPage ccPage = new CreditCardPage();
   
    @When("user clicks on the “Credit Cards” icon")
    public void user_clicks_on_the_Credit_Cards_icon() {
    	ccPage.creditCards.click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
   
}
