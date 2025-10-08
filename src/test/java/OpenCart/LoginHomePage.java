package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage {
	 WebDriver driver;

	    // Locate elements
	    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
	    WebElement myAccount;
	    
	    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	    WebElement login;
	    
	 // Constructor
	    public LoginHomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    //Actions
	    public void ClickMyAccount() {
	        myAccount.click();  
	    }

	    public void clickLogin() {
	        login.click();   // 
	    }
	}

