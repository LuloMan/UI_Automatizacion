package dropDown;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;

public class DropDownTest extends BaseTests {
    
    @Test
    public void testSelectOPtion(){
        String option = "Option 1";
        var dropDownPage = homePage.ClickDropDownLink();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOption();
        
        Assert.assertEquals(selectedOptions.size(), 1);
        Assert.assertTrue(selectedOptions.contains(option));
    }

}
