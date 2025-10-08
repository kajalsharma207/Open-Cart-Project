package TestCases;

import org.testng.annotations.Test;
import OpenCart.AddToCartPage;
import TestBase.BaseTest;

public class AddToCartTest extends BaseTest {
	
//	 @Test
     void Test() {
    	 logger.info("----Add to cart test Started----");
    	 logger.debug("This is a debug log message");
		    //Add to cart 
	    	AddToCartPage additem = new AddToCartPage(driver);
	    	additem.ClickCartItem();
	    	logger.info("----Clicked on item----");
	    	additem.ClickAddToCartItem();
	    	logger.info("----Clicked on Add to cart button----");
	    	logger.info("----Add to cart test finish----");
}
}
