package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automation.stepDefinitions", "com.automation.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TEST-1"
        /*
        y asi es como te fuiste TESTEADO
        de mi test
        pedazo de FRACASADO
        si no te gustan estos features
        andate  A LA CONCHA DE TU HERMANA
        PELOTUDA
        fuiste testeado
         */

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}