package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import OpenCart.HomePage;
import OpenCart.RegisterPage;
import TestBase.BaseTest;

public class RegisterTest extends BaseTest {

//    @Test
    void testRegisterUser() {
        HomePage home = new HomePage(driver);
        home.ClickMyAccount();
        home.clickRegister();     // click register link

        RegisterPage reg = new RegisterPage(driver);

        reg.setFirstName("Palak");
        reg.setLastName("Sharma");
        reg.setEmail("palak29@gmail.com");
        reg.setTelephone("9876343210");
        reg.setPassword("Palak@123");
        reg.selectNewsletterNo();
        reg.acceptPrivacyPolicy();
        reg.clickContinue();

        // Verify
        Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");
    }
}
