package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	WebDriver driver;

    // Locate elements
    @FindBy(xpath= "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")
    WebElement Cartitem;
    
    @FindBy(xpath="//*[@id=\"button-cart\"]")
    WebElement addtocartitem;
    
    
 // Constructor
    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
 // Actions
    public void ClickCartItem() {
    	Cartitem.click();
    }
    public void ClickAddToCartItem() {
    	addtocartitem.click();
    }

}
