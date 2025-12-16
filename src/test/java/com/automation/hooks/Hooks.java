package com.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setup() throws IOException {
        properties = loadProperties();

        String browser = getProperty("browser");

        switch (browser) {
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Navegador no soportado");
        }
    }

    private WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("--ignore-certificate-errors");

        if (getProperty("headless").equals("true")) {
            options.addArguments("headless");
        }

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        // ruta al binario del driver
        if (!getProperty("docker_enable").equals("true")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        }

        return new ChromeDriver(options);
    }

    private WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--private");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        if (!getProperty("docker_enable").equals("true")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
        }

        return new FirefoxDriver(options);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }

    private Properties loadProperties() throws IOException {
        Properties props = new Properties();

        props.load(
                new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties")
        );

        System.getProperties().forEach((key, value) -> {
            if (props.containsKey(key)) {
                props.setProperty(key.toString(), value.toString());
            }
        });

        return props;
    }
}
