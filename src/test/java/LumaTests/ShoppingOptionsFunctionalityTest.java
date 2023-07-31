package LumaTests;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShoppingOptionsFunctionalityTest extends BaseTest {
    @Test(description = "Validation of Shopping Options functionality")
    void shoppingOptionsFunctionalityTest() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("narrow-by-list")));
        Thread.sleep(5000);
        shoppingOptionsPage.selectOptionFromDropdown(shoppingOptionsPage.styleSectionDropDown, shoppingOptionsPage.fullZeepSection)
                .selectOptionFromDropdown(shoppingOptionsPage.sizeSectionDropDown, shoppingOptionsPage.sizeOption)
                .selectOptionFromDropdown(shoppingOptionsPage.priceSectionDropDown, shoppingOptionsPage.priceOption)
                .selectOptionFromDropdown(shoppingOptionsPage.colorSectionDropDown, shoppingOptionsPage.colorOption)
                .selectOptionFromDropdown(shoppingOptionsPage.materialSectionDropDown, shoppingOptionsPage.materialOption);

    }
}
