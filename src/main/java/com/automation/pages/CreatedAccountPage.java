package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatedAccountPage extends BasePage {

    private By successfullyText = By.xpath("//p[contains(text(), \"account has been successfully created\")]");

    public CreatedAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSuccessfullyTextVisible() {
        return isDisplayed(successfullyText);
    }

}