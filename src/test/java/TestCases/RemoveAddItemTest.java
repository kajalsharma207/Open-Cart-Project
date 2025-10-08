package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OpenCart.LoginPage;
import OpenCart.RemoveItemPage;
import TestBase.BaseTest;

public class RemoveAddItemTest extends BaseTest {
		
//		 @Test
     void Test() {
    	 logger.info("");
			 LoginPage lp = new LoginPage(driver);
			 lp.clickMyAccount();
		    	lp.clickLogin();
		    	
		    	lp.setEmail("palak27@gmail.com");
		    	lp.setPassword("Palak@123");
		    	lp.clicklogin();
		    	
			 RemoveItemPage remitem = new RemoveItemPage(driver);
			
			 remitem.ClickItemCount();
		     remitem.ClickRemoveItem();
		    	
	

}
}
