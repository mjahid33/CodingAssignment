package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreditCardPage {
    WebDriver driver = Driver.getDriver();
    public CreditCardPage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()='Credit Cards']")
    public WebElement creditCards;
    
   
}
