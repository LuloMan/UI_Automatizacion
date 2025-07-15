package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFromLeftFrame() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getTextFromBottomFrame() {
        driver.switchTo().frame("frame-bottom");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().defaultContent();
        return text;
    }

}
