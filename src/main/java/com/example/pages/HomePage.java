package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;

    private By formAuthLink = By.linkText("Home Authentication");

    public HomePage(WebDriver Driver){
        this.driver = Driver;
    }

    public LoginPage ClickFormAuthLink(){
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);//le pasamos el driver para no crear una nueva instancia
    }
    
}
