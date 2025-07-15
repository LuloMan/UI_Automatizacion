package hover;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class HoverTests extends BaseTests {

    @Test 
    public void testHoverUser1(){ 
        var hoversPage = homePage.clickHovers(); 
        var caption = hoversPage.hoverOverFigure(1); 
        Assert.assertTrue(caption.isCaptionDisplayed(), "No se muestra el caption"); 
        Assert.assertEquals(caption.getTitle(), "name: user1", "Titulo incorrecto"); 
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption incorrecto"); 
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrecto"); 
    }
}
