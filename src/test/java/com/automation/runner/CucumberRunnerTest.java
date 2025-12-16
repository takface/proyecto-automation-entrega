package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automation.stepDefinitions", "com.automation.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@TEST-1237"
        //fuiste testeado por kta -3-

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}