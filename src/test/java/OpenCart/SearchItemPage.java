package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemPage {
	
	    WebDriver driver;

	    // Search input box
	    @FindBy(name="search")
	    WebElement txtSearch;

	    // Search button
	    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
	    WebElement btnSearch;

	    // Constructor
	    public SearchItemPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Actions
	    public void enterSearchText(String productName) {
	        txtSearch.clear();
	        txtSearch.sendKeys(productName);
	    }

	    public void clickSearchButton() {
	        btnSearch.click();
	    }
	}
