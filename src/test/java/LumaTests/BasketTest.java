package LumaTests;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {
    @Test(description = "Validate functionality of Basket")
    void basketFunctionality() {
        driver.get("https://magento.softwaretestingboard.com");
        basketPage.gearButton.click();
        basketPage.bagsButton.click();
        basketPage.bag.click();
        basketPage.addToCartBtn.click();
        elementActions.scrollToTop(driver);
        orderPage.clickTheBasketBtn().clickProceedToCheckOutBtn();
        String actualProductName = basketPage.bag.getText();
        String expectedProductName = "Push It Messenger Bag";
        Assert.assertEquals(actualProductName, expectedProductName);
        String actualProductPrice = basketPage.productPrice.getText();
        String expectedProductPrice = "$45.00";
        Assert.assertEquals(actualProductPrice, expectedProductPrice);
        String productQuantityElement = basketPage.productQuantityElement.getText();
        String actualProductQuantity = productQuantityElement;
        String expectedProductQuantity = "1";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity);


    }
}
