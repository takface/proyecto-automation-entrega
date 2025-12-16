package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginBtn = By.xpath("//input[@value=\"Login\"]");
    private By errorMessage = By.xpath("//div[normalize-space()=\"Warning: No match for E-Mail Address and/or Password.\"]");
    //private By errorMessage = By.xpath("//div[contains(text(), \"Warning: No match\")]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        clear(emailInput);
        sendKeys(emailInput, username);
        clear(passwordInput);
        sendKeys(passwordInput, password);
        click(loginBtn);
    }

    public boolean errorMessageIsDisplayed() {
        return isDisplayed(errorMessage);
    }
}