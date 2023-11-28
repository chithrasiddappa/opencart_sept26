package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	
	@Test(groups= {"Regression", "Master"})
	public void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs...");
		logger.info("***  Starting TC_001_AccountRegistrationTest  ***");
		//try
		//{
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		logger.info("Clicked on Register link");
		Thread.sleep(10000);
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		logger.info("Providing customer data");
		
		regpage.setUserName(randomString());
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setCountryID("India");
		
		String password = randomAlphanumeric();
		regpage.setPassword(password);
		regpage.clickRegister();
		logger.info("Clicked on Register");
		
		String confmsg = regpage.getConfirmationMsg();
		
		logger.info("Validating expected message");
		
		Assert.assertEquals(confmsg, "Welcome to OpenCart, your account has been created","Test failed");
		
		//}
		
		/*catch(Exception e)
		{
		    logger.error("test failed");
			Assert.fail();
		}*/
		
		
		logger.info("***  Finished TC_001_AccountRegistrationTest  ***");
			
	}
		
}
