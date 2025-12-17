package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.LogoutPage;
import com.automation.pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LogoutDefinitions {

    private MyAccountPage myAccountPage;
    private LogoutPage logoutPage;

    public LogoutDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.logoutPage = new LogoutPage(Hooks.getDriver());
    }

    @Cuando("el usuario se desloguea")
    public void elUsuarioSeDesloguea() {
        myAccountPage.logout();
    }

    @Entonces("se muestra mensaje de logout")
    public void seMuestraMensajeDeLogout() {
        Assert.assertTrue(
                logoutPage.logoutMessageIsDisplayed(),
                "No se muestra el mensaje de logout"
        );
    }
}
