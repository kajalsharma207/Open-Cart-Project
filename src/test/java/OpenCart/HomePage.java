package OpenCart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    // Locate elements
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    WebElement register;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions without wait
    public void ClickMyAccount() {
        myAccount.click();  // directly click
    }

    public void clickRegister() {
        register.click();   // directly click
    }
}

