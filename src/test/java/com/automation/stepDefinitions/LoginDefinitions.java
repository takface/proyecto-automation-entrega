package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario se loguea con datos válidos")
    public void elUsuarioSeLogueaConDatosVálidos() {
        var username = Hooks.getProperty("username");
        var password = Hooks.getProperty("password");
        loginPage.login(username, password);
    }

    @Entonces("se verifica que el usuario se logueo correctamente")
    public void seVerificaQueElUsuarioSeLogueoCorrectamente() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed(), "El titulo no es visible");
    }

    @Cuando("el usuario se loguea con datos inválidos")
    public void elUsuarioSeLogueaConDatosInválidos() {
        loginPage.login("pepe@gmail.com", "abc456");
    }

    @Entonces("se muestra un mensaje de error de login.feature")
    public void seMuestraUnMensajeDeErrorDeLogin() {
        Assert.assertTrue(loginPage.errorMessageIsDisplayed(), "Mensaje de error no visible");
    }
}