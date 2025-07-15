package javaScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class JavaScriptTests extends BaseTests {

    @Test 
    public void testScrollToTable(){ 
        homePage.ClickLargeAndDeepDom().scrollToTable(); 
    }

    @Test
    public void testInfiniteScroll(){
        var infiniteScrollPage = homePage.ClickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagraph();

        Assert.assertEquals(infiniteScrollPage.getParrafo().size(), 5);
    }

}
