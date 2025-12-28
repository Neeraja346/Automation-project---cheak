package cheak_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[2]/div/a")
	WebElement Home;
	
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[1]/nav/ul/li[2]/a")
	WebElement BestSeller;
	
	@FindBy(xpath="//*[@id=\"gf-products\"]/div[6]/div/div[2]/div[1]/div[1]/a")
	WebElement prdct;
	

	public Product_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void buttn_click() throws InterruptedException
	{
		Home.click();
		BestSeller.click();
	
	//	Filter.click();
	//	Thread.sleep(2000);
	//	size.click();
		
		Thread.sleep(2000);
		//Apply.click();
		
	//	sort.click();
	//	Thread.sleep(2000);
	//	price.click();
		
	}
	public void Select_product() throws InterruptedException
	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		prdct.click();
		Thread.sleep(2000);
	//	prdct_size.click();
		
	}
	
}
