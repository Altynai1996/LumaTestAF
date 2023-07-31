package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driversFactory.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ShoppingOptionsPage extends BasePage {
    @FindBy(id = "narrow-by-list")
    public WebElement shoppingOptions;
    @FindBy(xpath = "//div[text()='Style']")
    public WebElement styleSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?style_general=128']")
    public WebElement fullZeepSection;
    @FindBy(xpath = "//div[text()='Size']")
    public WebElement sizeSectionDropDown;
    @FindBy(xpath = "//a[@aria-label='XS']//div[contains(@class,'swatch-option text')][normalize-space()='XS']")
    public WebElement sizeOption;
    @FindBy(xpath = "//div[text()='Price']")
    public WebElement priceSectionDropDown;
    @FindBy(xpath = "//span[normalize-space()='$59.99']")
    public WebElement priceOption;
    @FindBy(xpath = "//div[text()='Color']")
    public WebElement colorSectionDropDown;
    @FindBy(xpath = "//a[@aria-label='Blue']//div[contains(@class,'swatch-option color')]")
    public WebElement colorOption;
    @FindBy(xpath = "//div[text()='Material']")
    public WebElement materialSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?color=50&material=33&price=50-60&size=166&style_general=128']")
    public WebElement materialOption;
    @FindBy(xpath = "//div[text()='Eco Collection']")
    public WebElement ecoCollectionSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?eco_collection=1']")
    public WebElement ecoCollectionOption;
    @FindBy(xpath = "//div[text()='Performance Fabric']")
    public WebElement performanceFabricSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?performance_fabric=1']")
    public WebElement performanceFabricOption;
    @FindBy(xpath = "//div[text()='Erin Recommends']")
    public WebElement erinRecommendsSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?erin_recommends=1']")
    public WebElement erinRecommendsOption;
    @FindBy(xpath = "//div[text()='Erin Recommends']")
    public WebElement climateSectionDropDown;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html?climate=201']")
    public WebElement allWeatherOption;

    public ShoppingOptionsPage waitButtonToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ShoppingOptionsPage clickTheButtonWaitingElement(WebElement element) {
        waitButtonToBeClickable(element);
        element.click();
        return this;
    }

    public ShoppingOptionsPage clickTheButton(WebElement element) {
        element.click();
        return this;
    }

    public ShoppingOptionsPage selectOptionFromDropdown(WebElement dropDownElement, WebElement optionElement) {
        clickTheButton(dropDownElement);
       clickTheButtonWaitingElement(optionElement);
        return this;
    }


}


