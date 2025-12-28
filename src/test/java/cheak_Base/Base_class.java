package cheak_Base;



import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base_class {

    public static WebDriver driver;
    
    public String Url ="https://cheak.com";

    @BeforeTest
    public void setup() throws Exception {
        driver = new ChromeDriver();   
      //  driver.get("https://www.cheak.com/");
        
        driver.get(Url);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    @BeforeMethod
//    public void setup() throws Exception {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.cheak.com/");   
    
    
    Thread.sleep(3000);
       Actions act=new Actions(driver);
       act.sendKeys(Keys.ESCAPE).perform();
    }
  

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
