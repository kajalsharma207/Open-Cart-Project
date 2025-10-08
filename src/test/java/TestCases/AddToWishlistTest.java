package TestCases;

import org.testng.annotations.Test;
import OpenCart.AddToWishlistPage;
import TestBase.BaseTest;

public class AddToWishlistTest extends BaseTest {
//	@Test
    void Test() {
    	logger.info("----Add item to wishlist test started----");
		    //Add to cart 
	    	AddToWishlistPage additem = new AddToWishlistPage(driver);
	    	additem.ClickWishList();
	    	logger.info("----Clicked on Item add to wishlist----");
	    	logger.info("----Add to wishlist test finish----");
}

}
