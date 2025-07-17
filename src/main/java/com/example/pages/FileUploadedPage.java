package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadedPage {

    private WebDriver driver;
    private By uploadedFilesText = By.id("uploaded-files");

    public FileUploadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFilesText).getText();
    }

}
