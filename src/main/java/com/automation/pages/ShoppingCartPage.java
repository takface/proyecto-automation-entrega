package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    private By productName = By.linkText("Canon EOS 5D");

    private By totalPrice = By.xpath("//td[contains(text(),'$240.00')]");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean productNameIsDisplayed() {
        return isDisplayed(productName);
    }

    public boolean total240() {
        return isDisplayed(totalPrice);
    }
}
