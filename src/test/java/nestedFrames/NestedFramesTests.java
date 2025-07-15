package nestedFrames;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testTextInLeftAndBottomFrames() {
        var nestedFramesPage = homePage.ClickNestedFramesLink();
        String leftText = nestedFramesPage.getTextFromLeftFrame();
        Assert.assertEquals(leftText, "LEFT");

        String bottomText = nestedFramesPage.getTextFromBottomFrame();
        Assert.assertEquals(bottomText, "BOTTOM");
    }

}
