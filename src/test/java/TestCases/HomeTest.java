package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import OpenCart.HomePage;
import TestBase.BaseTest;

public class HomeTest extends BaseTest {

//	    @Test
        void Test() {
	    	HomePage home = new HomePage(driver);
	        home.ClickMyAccount();
	        home.clickRegister();
	    
	    Assert.assertEquals(driver.getTitle(), "Register Account");
	    }
}


