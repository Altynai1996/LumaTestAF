package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage {
    @FindBy(xpath = "(//span[text()='Gear'])[1]")
    public WebElement gearButton;
    @FindBy(xpath = "(//a[text()='Bags'])[2]")
    public WebElement bagsButton;
    @FindBy(xpath = "(//img[@class='product-image-photo'])[1]")
    public WebElement bag;
    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCartBtn;
    @FindBy(xpath= "//button[@class='update-cart-item']")
    public WebElement productQuantityElement;
    @FindBy(xpath= "(//span[@class='price'])[1]")
    public WebElement productPrice;

}
