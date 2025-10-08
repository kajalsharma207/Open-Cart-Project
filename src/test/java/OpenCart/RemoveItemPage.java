package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveItemPage {
WebDriver driver;
	
	//Element Locate

   @FindBy(xpath = "//*[@id=\"cart-total\"]")
    WebElement itemCount;
  
    @FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
	WebElement removeItem;
	
	// Constructor
    public RemoveItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
 // Actions
//    public void ClickItemAdd() {
//    	itemAdd.click();
//    }
    
    public void ClickItemCount() {
    	itemCount.click();
    }
  
    public void ClickRemoveItem() {
    	removeItem.click();
    }


}
