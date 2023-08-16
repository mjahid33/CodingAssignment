package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AssertPage {
    WebDriver driver = Driver.getDriver();
    public AssertPage(){

        PageFactory.initElements(driver, this);
    }
     
    @FindBy(xpath = "//p[contains(text(), '%')]")
   // @FindBy(xpath = "//*[contains(text(),'APR for Cash Advances')]/following-sibling::*[1]")
    public WebElement validateAPR;

 

}
