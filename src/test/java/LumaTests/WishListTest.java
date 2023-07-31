package LumaTests;

import BaseTest.BaseTest;
import com.digitalnomads.selenium.ui.enums.LoginCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class WishListTest extends BaseTest {
    @Test(description = "Validate Wishlist page")
    void wishList() {
        driver.get("https://magento.softwaretestingboard.com/women.html");
        wishListPage.clickTheButton(wishListPage.topsSection)
                .clickTheButton(wishListPage.optionOfTops);
        elementActions.clickButton(wishListPage.addToWishListBtn);
        wishListPage.enterEmail(LoginCredentials.altynaiEmail.getCredentials())
                .enterPassWord(LoginCredentials.altynaiPassword.getCredentials());
        wishListPage.clickTheButton(wishListPage.submitBtn);
        List<WebElement> wishlistProducts = driver.findElements(By.xpath("//div[@class='products-grid wishlist']"));
        Assert.assertFalse(wishlistProducts.isEmpty());
    }
    }


