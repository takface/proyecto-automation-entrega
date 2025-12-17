package com.automation.stepDefinitions;

import com.automation.hooks.Hooks;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.CreatedAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;

public class CreateAccountDefinitions {

    private CreateAccountPage createAccountPage;
    private CreatedAccountPage createdAccountPage;

    public CreateAccountDefinitions() {
        this.createAccountPage = new CreateAccountPage(Hooks.getDriver());
        this.createdAccountPage = new CreatedAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario crea la cuenta")
    public void elUsuarioCreaLaCuenta() {
        String emailRandom = String.format("%s@gmail.com", RandomStringUtils.randomAlphabetic(5));

        createAccountPage.register("Jhone",
                "Doe",
                emailRandom,
                "123456789",
                "abc123");
    }

    @Entonces("se verifica que la cuenta se creo correctamente")
    public void seVerificaQueLaCuentaSeCreoCorrectamente() {
        Assert.assertTrue(createdAccountPage.isSuccessfullyTextVisible(),
                "El texto de 'Cuenta creada' no esta visible");
    }

    @Cuando("el usuario crea la cuenta con datos vacios")
    public void elUsuarioCreaLaCuentaConDatosVacios() {
        createAccountPage.registerWithEmptySpace();
    }

    @Entonces("se muestra mensaje de error de crear cuenta")
    public void seMuestraMensajeDeErrorDeCrearCuenta() {
        Assert.assertTrue(
                createAccountPage.firstNameErrorIsDisplayed(),
                "No se muestra el mensaje de error del campo First Name"
        );
    }

}