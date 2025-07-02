package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("button");
    
    public LoginPage(WebDriver Driver) {
        this.driver = Driver;
    }

    public void setUsernameField(String username) {
        driver.findElement(usernameField).sendKeys(username);//sendKeys envia texto al elemento encontrado
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password); 
    }

    public SecureAreaPage ClickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
