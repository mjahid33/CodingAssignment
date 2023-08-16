//package stepDefinitions;
//
//import io.cucumber.java.en.*;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import pages.DiscoverAllPages;
//import utilities.Driver;
//
//public class DiscoverAllPagesSteps {
//
//    WebDriver driver= Driver.getDriver();
//    DiscoverAllPages allPages = new DiscoverAllPages();
//    
//    @Given("User navigates to Discover HomePage")
//    public void user_navigates_to_Discover_HomePage() {
//    	driver.navigate().to("https://www.discover.com/");
//    	driver.manage().window().maximize();
//    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//       
//    }
//
//    @When("user clicks on the “Credit Cards” icon")
//    public void user_clicks_on_the_Credit_Cards_icon() {
//    	allPages.creditCards.click();
// 
//    }
//
//    @When("user clicks “Apply Now” for card type: Secured Credit Card")
//    public void user_clicks_Apply_Now_for_card_type_Secured_Credit_Card() throws InterruptedException {
//    	allPages.applyNow.click();
//    	Thread.sleep(2000);
//    
//    }
//
//    @Then("user skips the pre-fill step")
//    public void user_skips_the_pre_fill_step() {
//    	allPages.skip.click();
//       
//    }
//
//    @Then("user verifies that the APR for Cash Advances is greater than {int}%")
//    public void user_verifies_that_the_APR_for_Cash_Advances_is_greater_than(Integer int1) {
//    	String  aprText=allPages.validateAPR.getText();
//    	float aprValue = Float.parseFloat(aprText.replace("%", ""));
//    	
//    	assert aprValue > 20.0 : "APR for Cash Advances is not greater than 20%: " + aprValue + "%";
//    }
//
//}
