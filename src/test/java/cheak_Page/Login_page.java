package cheak_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"section-header\"]/div[1]/div[3]/a[1]")WebElement logbtn;
	@FindBy(name="customer[email]")WebElement email;
	@FindBy(name="customer[password]")WebElement password;
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")WebElement loginbutton ;
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void bttn_click() {
		logbtn.click();
	}
	public void SetValues(String mail,String pass) {
		 
	    email.sendKeys(mail);
		password.sendKeys(pass);
		
	}
	
	public void button_click() {
		
		loginbutton.click();
	}
	
	
}
