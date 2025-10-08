package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

    
	// Locate elements
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    WebElement myAccount;
    
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    WebElement login;
    
    @FindBy(id = "input-email")
    WebElement txtEmail;
    
    @FindBy(id = "input-password")
    WebElement txtPassword;
    
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnLogin;
    
    
    
 // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //Action
    public void clickMyAccount() {
        myAccount.click();  
    }

    public void clickLogin() {
        login.click();   // 
    }
    
    public void setEmail(String email) {
        txtEmail.sendKeys(email);
    }
    
    public void setPassword(String pswd) {
        txtPassword.sendKeys(pswd);
    }
    
    public void clicklogin() {
        btnLogin.click();
    }

    
    
    

}
