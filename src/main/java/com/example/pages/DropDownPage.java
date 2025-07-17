package com.example.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    
    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> selectedSelection = findDropDownElement().getAllSelectedOptions();
        List<String> selectedStrings = new ArrayList<>();

        for(WebElement element : selectedSelection){
            selectedStrings.add(element.getText());
        }

        return selectedStrings;
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

    public void enableMultiSelect() {
        WebElement dropElement = driver.findElement(dropdown);
        //El siguiente script añade el atributo multiple al elemento dropdown para seleccionar multiples opciones
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor) driver).executeScript(script, dropElement);
    }

}
