	package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveWishlistPage {
	WebDriver driver;
	
	//Element Locates
	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/i")
	WebElement Wishlist;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")
	WebElement Remove;
	
	public RemoveWishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
//	Actions
	public void ClickwishList() {
    	Wishlist.click();
    }
	
	public void Clickremove() {
    	Remove.click();
    }
	
	

}
