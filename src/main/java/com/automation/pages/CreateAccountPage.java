package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By phone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By checkbox = By.name("agree");
    private By continueBtn = By.xpath("//input[@value=\"Continue\"]");
    private By firstNameErrorMessage =
            By.xpath("//input[@id='input-firstname']/following-sibling::div[@class='text-danger']");


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void register(String firstName,
                         String lastName,
                         String email,
                         String phone,
                         String password) {
        sendKeys(this.firstName, firstName);
        sendKeys(this.lastName, lastName);
        sendKeys(this.email, email);
        sendKeys(this.phone, phone);
        sendKeys(this.password, password);
        sendKeys(this.confirmPassword, password);

        click(checkbox);

        click(continueBtn);
    }
    public void registerWithEmptySpace() {
        sendKeys(this.lastName, "Doe");
        sendKeys(this.email, "test" + System.currentTimeMillis() + "@gmail.com");


        click(checkbox);

        click(continueBtn);
    }

    public boolean firstNameErrorIsDisplayed() {
        return isDisplayed(firstNameErrorMessage);
    }


}