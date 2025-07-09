package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.cssSelector("input[type='range']");
    private By valueLabel = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSliderTo(double targetValue) {
        WebElement sliderElement = driver.findElement(slider);

        double currentValue = 0.0;
        while (currentValue < targetValue) {
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
            currentValue += 0.5;
        }
    }

    public String getSliderValue() {
        return driver.findElement(valueLabel).getText();
    }
}
