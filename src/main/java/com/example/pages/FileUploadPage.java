package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;

    private By uploadButton = By.id("file-upload");
    private By submitButton = By.id("file-submit"); 
    //private By uploadedFilesText = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public FileUploadedPage uploadFile(String rutaAbsoluta) {
        driver.findElement(uploadButton).sendKeys(rutaAbsoluta);
        driver.findElement(submitButton).click();
        return new FileUploadedPage(driver);
    }

}
