package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContent {

    private WebDriver driver;

    private By example1Link = By.linkText("Example 1: Menu Element");

    public ShiftingContent(WebDriver driver) {
        this.driver = driver;
    }

    public Example1 ClickExample1(){
        driver.findElement(example1Link).click();
        return new Example1(driver);
    }

}
