package com.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By AlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By ConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By PromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAlert() {
        driver.findElement(AlertButton).click();
    }

    public void clickConfirm() {
        driver.findElement(ConfirmButton).click();
    }

    public void clickPrompt() {
        driver.findElement(PromptButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertText() {
        String textoAlerta = driver.switchTo().alert().getText();
        return textoAlerta;
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
