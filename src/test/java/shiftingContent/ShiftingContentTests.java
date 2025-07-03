package shiftingContent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.Example1;
import com.example.pages.ShiftingContent;

import base.BaseTests;

public class ShiftingContentTests extends BaseTests {

    @Test
    public void testExample1(){
        ShiftingContent sContent = homePage.ClickShiftingContentLink();
        Example1 e1 = sContent.ClickExample1();
        List<WebElement> lista = e1.ListElements();
        
        Assert.assertFalse(lista.isEmpty());
        for(WebElement element : lista){
            System.out.println(element.getText());
        }
    }
}
