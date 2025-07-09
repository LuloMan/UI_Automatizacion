package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slider = By.cssSelector("input[type='range']");
    private By value = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(double targetValue) {
        WebElement sliderElement = driver.findElement(slider);

        double valor = 0.0;
        while (valor < targetValue) {
            sliderElement.sendKeys(Keys.ARROW_RIGHT);
            valor += 0.5;
        }
    }

    public String getSliderValue() {
        return driver.findElement(value).getText();
    }
}
