package com.digitalnomads.selenium.ui.helper;

import com.digitalnomads.selenium.ui.driversFactory.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementActions {
    public ElementActions waitButtonToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public ElementActions clickButton(WebElement element) {
        waitButtonToBeClickable(element);
        highlightElement(element);
        element.click();
        return this;
    }

    public ElementActions writeText(WebElement element, String txt) {
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }
    public ElementActions writeNumber(WebElement element, int number) {
        waitElementToBeDisplayed(element);
        element.sendKeys(Integer.toString(number));
        return this;
    }

    public ElementActions scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public ElementActions clickJavaScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click(true);", element);
        return this;

    }

    public ElementActions writeTextWithEnter(WebElement element, String txt) {
        waitElementToBeDisplayed(element);
        element.sendKeys(txt, Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);
        return this;
    }
    public ElementActions highlightElement(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "border: 2px solid green");
        return this;
    }
    public ElementActions scrollToTop(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 0);");
        return this;
    }
    }

