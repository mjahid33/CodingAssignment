package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SkipPage {
    WebDriver driver = Driver.getDriver();
    public SkipPage(){

        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//*[contains(text(), 'Skip')]")      
    
    public WebElement skip;
  
}
