package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;

    private By confirmationMessage = By.tagName("h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
