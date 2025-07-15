package com.example.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example1 {

    private WebDriver driver;

    public Example1(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> ListElements(){
        List<WebElement> list = driver.findElements(By.tagName("li"));//encuentra una lista de elementos
        return list;
    }
}
