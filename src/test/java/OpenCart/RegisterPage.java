package OpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

    // 🔹 Input fields
    @FindBy(id = "input-firstname")
    WebElement txtFirstName;

    @FindBy(id = "input-lastname")
    WebElement txtLastName;

    @FindBy(id = "input-email")
    WebElement txtEmail;

    @FindBy(id = "input-telephone")
    WebElement txtTelephone;

    @FindBy(id = "input-password")
    WebElement txtPassword;

    @FindBy(id = "input-confirm")
    WebElement txtConfirmPassword;

    //Newsletter
    @FindBy(xpath = "//input[@name='newsletter' and @value='1']")
    WebElement radioSubscribeYes;

    @FindBy(xpath = "//input[@name='newsletter' and @value='0']")
    WebElement radioSubscribeNo;

    //checkbox
    @FindBy(name = "agree")
    WebElement chkPrivacyPolicy;

    //Continue button
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btnContinue;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void setFirstName(String fstname) {
        txtFirstName.sendKeys(fstname);
    }

    public void setLastName(String lstname) {
        txtLastName.sendKeys(lstname);
    }

    public void setEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTelephone(String phone) {
        txtTelephone.sendKeys(phone);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
        txtConfirmPassword.sendKeys(pwd);
    }

    public void selectNewsletterYes() {
        radioSubscribeYes.click();
    }

    public void selectNewsletterNo() {
        radioSubscribeNo.click();
    }

    public void acceptPrivacyPolicy() {
        chkPrivacyPolicy.click();
    }

    public void clickContinue() {
        btnContinue.click();
    }

}
