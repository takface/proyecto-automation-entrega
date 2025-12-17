package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    private By productName = By.linkText("Canon EOS 5D");



    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean productNameIsDisplayed() {
        return isDisplayed(productName);
    }

}
