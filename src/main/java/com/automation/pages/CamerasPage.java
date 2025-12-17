package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CamerasPage extends BasePage {

    private By camerasMenu = By.xpath("//a[text()='Cameras']");
    private By canonEos5D = By.linkText("Canon EOS 5D");

    // select obligatorio de color
    private By colorSelect = By.id("input-option226");

    private By quantityInput = By.id("input-quantity");
    private By addToCartButton = By.id("button-cart");

    private By cartButton = By.id("cart-total");
    private By viewCartButton = By.xpath("//strong[text()=' View Cart']");

    public CamerasPage(WebDriver driver) {
        super(driver);
    }

    public void addCameraToCart() {
        click(camerasMenu);
        click(canonEos5D);


        sendKeys(colorSelect, "Red");

        clear(quantityInput);
        sendKeys(quantityInput, "3");

        click(addToCartButton);

        click(cartButton);
        click(viewCartButton);
    }
}

