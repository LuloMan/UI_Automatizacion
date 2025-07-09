package forgotPassord;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.EmailSentPage;

import base.BaseTests;

public class ForgotPasswordTest extends BaseTests {

     @Test
    public void testForgotPasswordFlow() {
        var forgotPage = homePage.ClickForgotPaswordLink();
        forgotPage.setEmailField("hola@hola.com");
        EmailSentPage sentPage = forgotPage.clickRetrievePasswordButton();

        Assert.assertTrue(sentPage.getMessage().contains("Your e-mail's been sent!"));
    }
}
