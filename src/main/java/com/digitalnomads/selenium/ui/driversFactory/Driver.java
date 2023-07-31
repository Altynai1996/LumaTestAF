package com.digitalnomads.selenium.ui.driversFactory;

import com.digitalnomads.selenium.ui.configuration.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {
    private Driver() {
        //Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxWebDriver();
                    break;
                case "edge":
                    driver=EdgeWebDriver.loadEdgeWebDriver();
                default:
                    throw new IllegalArgumentException("You provided wrong Driver name");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;

            }
        } catch (Exception e) {
            System.out.println("Error while closing driver");
        }
    }
}
