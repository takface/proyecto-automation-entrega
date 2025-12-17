package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.CamerasPage;
import com.automation.pages.ShoppingCartPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class AddToCartDefinitions {

    private CamerasPage camerasPage;
    private ShoppingCartPage shoppingCartPage;

    public AddToCartDefinitions() {
        this.camerasPage = new CamerasPage(Hooks.getDriver());
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
    }

    @Cuando("agrega producto al carrito")
    public void agregaProductoAlCarrito() {
        camerasPage.addCameraToCart();
    }

    @Entonces("producto se encuentra en el carrito")
    public void productoSeEncuentraEnElCarrito() {
        Assert.assertTrue(
                shoppingCartPage.productNameIsDisplayed(),
                "El nombre del producto no se muestra en el carrito"
        );


    }
}
