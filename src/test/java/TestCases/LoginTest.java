package TestCases;

import org.testng.annotations.Test;

import OpenCart.LoginPage;
import TestBase.BaseTest;

public class LoginTest extends BaseTest {
    
    
    @Test
    void Test() {
    	logger.info("----Login Test Started----");
    	logger.debug("This is a debug log message");
    	
    	LoginPage lp = new LoginPage(driver);
    	lp.clickMyAccount();
    	lp.clickLogin();
    	logger.info("----Click on MyAccount----");
    	logger.info("----CLicked on Login Button----");
    	
    	lp.setEmail("palak27@gmail.com");
    	lp.setPassword("Palak@123");
    	logger.info("----Enter Email and Password----");
    	
    	lp.clicklogin(); 
    	logger.info("----Click on Login----");
    	logger.info("----Login Test Finish----");
    	
    	
    	
    }
}

