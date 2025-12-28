package cheak_Page;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {

	WebDriver driver;
	@FindBy(xpath="//span[text()=\"Add To Cart\"]")
	WebElement addcart ;
	
	@FindBy(xpath="//button[@name='checkout']")  
	WebElement checkout ;
	
	
	@FindBy(xpath="//*[@id=\"Form1\"]/div[1]/div[1]/section/div[1]/div/div/section")WebElement cheakscreen;


	public Cart_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void buttn_click() throws InterruptedException
	{
		
		addcart.click();
		Thread.sleep(2000);
		
	}
	public void checkout() throws InterruptedException {
		

		Thread.sleep(2000);
		checkout.click();
		
		Thread.sleep(2000);
	}
	
	
	 public void screenshot() throws Exception
	   {

		
		 
		 Thread.sleep(8000); // wait for checkout page to fully load
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(src, new File("./Cheakscreenshot/checkout.png"));
	        System.out.println("Checkout page screenshot saved successfully");
		   
	   }
	
	
}
