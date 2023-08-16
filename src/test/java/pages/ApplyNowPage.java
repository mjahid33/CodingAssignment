package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ApplyNowPage {
    WebDriver driver = Driver.getDriver();
    public ApplyNowPage(){

        PageFactory.initElements(driver, this);
    }
        
    @FindBy(xpath = "//a[contains(@href,'SECURED_APPLY')]")
    public WebElement applyNow;

   
}
