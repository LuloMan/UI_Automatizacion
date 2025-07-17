package com.example.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfiniteScrollPage {

    private WebDriver driver;

    private By parrafo = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        while (getParrafo().size() < 5) {
            //el siguiente script scrollea hasta al final del pom al poner scrollHeight en la posicion "y"
            ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            wait.withTimeout(Duration.ofSeconds(5));
        }
    }

    public List<WebElement> getParrafo() {
        return driver.findElements(parrafo);
    }

}
