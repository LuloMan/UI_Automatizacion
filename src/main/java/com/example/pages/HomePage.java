package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;

    private By formAuthLink = By.linkText("Form Authentication");
    private By addRemoveLink = By.linkText("Add/Remove Elements");
    private By ShiftingContentLink = By.linkText("Shifting Content");

    public HomePage(WebDriver Driver){
        this.driver = Driver;
    }

    public LoginPage ClickFormAuthLink(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);//le pasamos el driver para no crear una nueva instancia
    }

    public AddRemoveElements ClickAddRemoveLink(){
        driver.findElement(addRemoveLink).click();
        return new AddRemoveElements(driver);
    }

    public ShiftingContent ClickShiftingContentLink(){
        driver.findElement(ShiftingContentLink).click();
        return new ShiftingContent(driver);
    }
    
}
