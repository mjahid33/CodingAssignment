package stepDefinitions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class HomePageStep {

    WebDriver driver= Driver.getDriver();
       
    @Given("User navigates to Discover HomePage")
    public void user_navigates_to_Discover_HomePage() {
    	driver.navigate().to("https://www.discover.com/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       
    }

}
