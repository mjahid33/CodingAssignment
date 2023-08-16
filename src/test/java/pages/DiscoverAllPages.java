//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import utilities.Driver;
//
//public class DiscoverAllPages {
//    WebDriver driver = Driver.getDriver();
//    public DiscoverAllPages(){
//
//        PageFactory.initElements(driver, this);
//    }
//    @FindBy(xpath = "//p[text()='Credit Cards']")
//    public WebElement creditCards;
//    
//    @FindBy(xpath = "//a[contains(@href,'SECURED_APPLY')]")
//    public WebElement applyNow;
//
//    @FindBy(xpath = "//*[contains(text(), 'Skip')]")
//    public WebElement skip;
//    
//    @FindBy(xpath = "//p[contains(text(), '%')]")
//   // @FindBy(xpath = "//*[contains(text(),'APR for Cash Advances')]/following-sibling::*[1]")
//    public WebElement validateAPR;
//
// 
//
//}
