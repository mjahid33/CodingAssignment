package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

   private Driver(){

   }
   private static WebDriver driver;

   public static WebDriver getDriver(){
      if(driver == null){
        //System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        
//        System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//        driver = new EdgeDriver();
         return driver;
      }
      else {
         return driver;
      }
   }

   public static void closeDriver(){

      if(driver != null){
         driver.quit();
         driver = null;
      }

   }
}
