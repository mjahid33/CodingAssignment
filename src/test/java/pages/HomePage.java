package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    WebDriver driver = Driver.getDriver();
    public HomePage(){

        PageFactory.initElements(driver, this);
    }
        
    
}
