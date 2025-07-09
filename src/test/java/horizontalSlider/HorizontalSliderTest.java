package horizontalSlider;

import org.testng.Assert;
import org.testng.annotations.Test;



import base.BaseTests;

public class HorizontalSliderTest extends BaseTests {

     @Test
     public void testSliderToValue() {
        var HorizontalSliderPage = homePage.ClickHorizontalSliderLink();
        HorizontalSliderPage.moveSlider(4.0);
        String value = HorizontalSliderPage.getSliderValue();
        Assert.assertEquals(value, "4");
    }
}
