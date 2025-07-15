package entryAd;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.EntryAdPage;

import base.BaseTests;

public class EntryAdTests extends BaseTests {

    @Test
    public void testEntryAdModal() {
        EntryAdPage entryAdPage = homePage.ClickEntryAdLink();
        entryAdPage.Waiting();
        Assert.assertTrue(driver.findElement(By.id("modal")).isEnabled());

        entryAdPage.closeModal();
        Assert.assertFalse(driver.findElements(By.id("modal")).get(0).isDisplayed());
    }
}
