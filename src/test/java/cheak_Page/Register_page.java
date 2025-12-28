package cheak_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[3]/a[1]")
	WebElement logbtn;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/div[3]/a")
	WebElement regbuttn;
	
	@FindBy(name="customer[first_name]")
	WebElement firstName;
	
	@FindBy(name="customer[last_name]")
	WebElement lastName;
	
	@FindBy(name="customer[email]")
	WebElement email ;
	
	@FindBy(name="customer[password]")
	WebElement passWord; 
	
	@FindBy(xpath="//*[@id=\"create_customer\"]/button")
	WebElement register;
	
	
	public Register_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void buttn_click()
	{
		logbtn.click();
		regbuttn.click();
	}


	public void SetValues(String fn,String ls,String em,String pass)
	{
		firstName.sendKeys(fn);
		lastName.sendKeys(ls);
		email.sendKeys(em);
		passWord.sendKeys(pass);
	
	}
	
	
	public void Register() 
	{
		register.click();
	}
}
