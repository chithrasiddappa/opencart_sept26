package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
 
	//Elements
	@FindBy(id = "input-username")
	WebElement txtUsername;
	
	@FindBy(name = "firstname")
	WebElement txtFirstname;
	
	@FindBy(name = "lastname")
	WebElement txtLastname;
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	@FindBy(name = "country_id")
	WebElement txtCountryid;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block visible-xs-block']")
	WebElement btnRegister;
	
	@FindBy(xpath = "//h3[normalize-space()='Welcome to OpenCart, your account has been created']")
     WebElement msgConfirmation;
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}

 public void setFirstName(String fname)
 {
	 txtFirstname.sendKeys(fname);
 }

public void setLastName(String lname)
{
	txtLastname.sendKeys(lname);
}

public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}

public void setCountryID(String countryid)
{
	txtCountryid.sendKeys(countryid);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

public void clickRegister()
{
	btnRegister.click();
}

public String getConfirmationMsg()
{
	try {
		return (msgConfirmation.getText());
	}
	catch (Exception e)
	{
		return (e.getMessage());
	}
}



}
