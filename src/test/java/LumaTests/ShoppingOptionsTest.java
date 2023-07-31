package LumaTests;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ShoppingOptionsTest extends BaseTest {
    @Test(description = " Verification of Shopping Options Section on Women's Tops Page")
    void shoppingOptionsSectionOnWomenPage() {
        driver.get("https://magento.softwaretestingboard.com/women/tops-women.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Shopping Options']")));
        List<WebElement> shoppingOptions = driver.findElements(By.id("narrow-by-list"));
        for (WebElement element : shoppingOptions) {
            System.out.println(element.getText());
        }
    }
    @Test(description = " Verification of Shopping Options Section on Men's Tops Page")
    void shoppingOptionsSectionOnMenPage() {
        driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Shopping Options']")));
        List<WebElement> shoppingOptions = driver.findElements(By.id("layered-filter-block"));
        for (WebElement element : shoppingOptions) {
            System.out.println(element.getText());
        }
    }



}
