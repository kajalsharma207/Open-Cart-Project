package TestCases;

import org.testng.annotations.Test;

import OpenCart.AddToWishlistPage;
import OpenCart.LoginPage;
import OpenCart.RemoveWishlistPage;
import TestBase.BaseTest;

public class RemoveWishListTest extends BaseTest {
//	@Test
    void Test() {
    	LoginPage lp = new LoginPage(driver);
		 lp.clickMyAccount();
	    	lp.clickLogin();
	    	
	    	lp.setEmail("palak27@gmail.com");
	    	lp.setPassword("Palak@123");
	    	lp.clicklogin();
		    //Add to cart 
		RemoveWishlistPage remitem = new RemoveWishlistPage(driver);
		remitem.ClickwishList();
		remitem.Clickremove();
		
	}
}


