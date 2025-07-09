package login;

import com.example.pages.LoginPage;
import com.example.pages.SecureAreaPage;
import org.testng.*;
import org.testng.annotations.Test;

import base.BaseTests;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccesfulLogin(){
        LoginPage login = homePage.ClickFormAuthLink();
        login.setUsernameField("tomsmith");
        login.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureArea = login.ClickLoginButton();

        Assert.assertTrue(secureArea.getAlertText().contains("You logged into a secure area!"));
    }

}
