package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
   //Elements
	@FindBy(linkText = "REGISTER")
	WebElement lnkRegister;
	
	@FindBy(linkText = "LOGIN")
	WebElement linkLogin;
	
	//Action Methods
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
}
