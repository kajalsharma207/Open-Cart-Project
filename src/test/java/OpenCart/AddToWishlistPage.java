package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishlistPage {
	WebDriver driver;
	
	//Element Locate
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")
	WebElement wishList;
	
	// Constructor
    public AddToWishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
 // Actions
    public void ClickWishList() {
    	wishList.click();
    }

	
	

}
