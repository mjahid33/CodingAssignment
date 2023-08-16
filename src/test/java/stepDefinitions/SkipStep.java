package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.SkipPage;
import utilities.Driver;

public class SkipStep {

    WebDriver driver= Driver.getDriver();
    SkipPage sPage = new SkipPage();
    
    @Then("user skips the pre-fill step")
    public void user_skips_the_pre_fill_step() {
    	   	
    	WebDriverWait wait = new WebDriverWait(driver, 10); 

    	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Skip')]")));

    	 sPage.skip.click();
    	 
    	 //As click navigated to a different page I had to use the next page URL.
    	 
         driver.get("https://www.discovercard.com/application/website/apply?adpt=mn&srcCde=KXPA&ICMPGN=ALL_CC_SECURED_APPLY_NOW_BTN&_gl=1*1cvhr91*_ga*MjExOTI0MjU5Ny4xNjkyMTUzMDUw*_ga_3MJNPV4VSE*MTY5MjIwNTQ0My40LjEuMTY5MjIwNTQ0OC41NS4wLjA.&_ga=2.184617440.85601018.1692130023-2119242597.1692153050&adobe_mc=MCMID%3D87579089574437912910469389947897858942%7CMCORGID%3D0D6C4673527839230A490D45%2540AdobeOrg%7CTS%3D1692205453");
        
        	   	
       
    }

}
