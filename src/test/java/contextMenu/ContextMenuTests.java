package contextMenu;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenuAlertAppears() {
        var contextMenuPage = homePage.ClickContextMenuLink();
        contextMenuPage.rightClick();
        String alertText = contextMenuPage.getAlertText();
        
        Assert.assertEquals(alertText, "You selected a context menu");
        contextMenuPage.acceptAlert();
    }

}
