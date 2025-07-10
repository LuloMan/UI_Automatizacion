package com.example.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElements {
    
    private WebDriver driver;

    private By addButton = By.cssSelector("button[onclick='addElement()']");
    private By DeleteButton = By.cssSelector("button[onclick='deleteElement()']");

    public AddRemoveElements(WebDriver Driver) {
        this.driver = Driver;
    }

    public void clickAddButton(){
        driver.findElement(addButton).click();
    }

    public void clickDeleteButton(){
        driver.findElement(DeleteButton).click();
    }

    public List<WebElement> FindDeleteButtons(){
        List<WebElement> list = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
        return list;
    }

}
