package alerts;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class AlertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.ClickAlertsLink();
        alertsPage.clickAlert();
        alertsPage.acceptAlert();
        String result = alertsPage.getResultText();

        Assert.assertEquals(result, "You successfully clicked an alert");
    }

    @Test
    public void testCancelConfirm() {
        var alertsPage = homePage.ClickAlertsLink();
        alertsPage.clickConfirm();
        String alertText = alertsPage.getAlertText();
        alertsPage.dismissAlert();

        Assert.assertEquals(alertText, "I am a JS Confirm");
    }

    @Test
    public void testCompletePrompt() {
        var alertsPage = homePage.ClickAlertsLink();
        alertsPage.clickPrompt();
        alertsPage.sendTextToAlert("Esto es una alerta!");
        alertsPage.acceptAlert();
        String result = alertsPage.getResultText();

        Assert.assertEquals(result, "You entered: Esto es una alerta!");
    }
}
