package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import OpenCart.SearchItemPage;
import TestBase.BaseTest;

public class SearchTest extends BaseTest {

//    @Test
    void testSearchItem() {
        SearchItemPage search = new SearchItemPage(driver);

        // Search for item
        search.enterSearchText("iphone");
        search.clickSearchButton();

        // Verify
        Assert.assertEquals(driver.getTitle(),"Search - iphone");
    }
}


