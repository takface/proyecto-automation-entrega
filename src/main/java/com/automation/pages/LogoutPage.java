package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

    private By logoutMessage =
            By.xpath("//p[contains(text(),'You have been logged off your account')]");

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean logoutMessageIsDisplayed() {
        return isDisplayed(logoutMessage);
    }
}

