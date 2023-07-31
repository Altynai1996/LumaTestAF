package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {
    @FindBy(xpath = "//a[text()='Hoodies & Sweatshirts']")
    public WebElement topsSection;
    @FindBy(xpath = "//img[@alt='Helena Hooded Fleece']")
    public WebElement optionOfTops;
    @FindBy(xpath = "(//span[text()='Add to Wish List'])[1]")
    public WebElement addToWishListBtn;
    @FindBy(xpath = "//div[@class='products-grid wishlist']")
    public WebElement wishList;
    @FindBy(id = "email")
    public WebElement emailForAddingItemsToWishList;
    @FindBy(id = "pass")
    public WebElement passwordForAddingItemsToWishList;
    @FindBy(id = "send2")
    public WebElement submitBtn;


    public WishListPage clickTheButton(WebElement element) {
        elementActions.clickButton(element);
        return this;
    }

    public WishListPage enterEmail(String email) {
        elementActions.writeText(emailForAddingItemsToWishList, email);
        return this;
    }

    public WishListPage enterPassWord(String password) {
        elementActions.writeText(passwordForAddingItemsToWishList, password);
        return this;
    }
}
