package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.event.CellEditorListener;

public class OrderPage extends BasePage{
    @FindBy(xpath="(//img[@class='product-image-photo'])[6]")
    public WebElement options;
    @FindBy(id = "option-label-size-143-item-167")
    public WebElement size;
    @FindBy(id = "option-label-color-93-item-50")
    public WebElement color;
    @FindBy(xpath = "//button[@title='Add to Cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "(//span[@class='counter qty'])[1]")
    public WebElement basketBtn;
    @FindBy(id = "top-cart-btn-checkout")
    public WebElement proceedToCheckoutBtn;
     @FindBy(xpath = "//a[text()='t-shirts for women']")
    public WebElement tShirtsForWomenBtn;



    public OrderPage clickSizeBtn(){
        elementActions.clickButton(size);
        return this;
    }
    public OrderPage clickColorBtn(){
        elementActions.clickButton(color);
        return this;
    }
    public OrderPage clickAddToCartBtn(){
        elementActions.clickButton(addToCartButton);
        return this;
    }
    public OrderPage chooseOption(){
        elementActions.clickButton(options);
        return this;
    }
    public OrderPage clickTheBasketBtn(){
        elementActions.clickButton(basketBtn);
        return this;
    }
    public OrderPage clickProceedToCheckOutBtn(){
        elementActions.clickButton(proceedToCheckoutBtn);
        return this;
    }
}
