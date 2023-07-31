package LumaTests;

import BaseTest.BaseTest;
import com.digitalnomads.selenium.ui.enums.OrderMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.digitalnomads.selenium.ui.enums.LoginCredentials.altynaiEmail;
import static com.digitalnomads.selenium.ui.enums.LoginCredentials.altynaiPassword;

public class OrderFunctionalityTests extends BaseTest {
    @Test(description = "Validate the product search functionality.")
    void searchEntireStoreInput() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/");
        WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.click();
        searchInput.sendKeys("T-shirts", Keys.ENTER);
        orderPage.tShirtsForWomenBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ol[@class='products list items product-items']")));
        List<WebElement> searchResults = driver.findElements(By.xpath("//ol[@class='products list items product-items']"));
        Assert.assertTrue(searchResults.size() > 0, "Результаты поиска не были найдены.");
        for (WebElement result : searchResults) {
            String productName = result.findElement(By.xpath("//ol[@class='products list items product-items']")).getText();
            Assert.assertTrue(productName.contains("T-shirts"), "Результаты поиска содержат неправильные товары.");
        }
    }

    @Test(description = "Validate the checkout process.")
    void addCart() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/");
        WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.click();
        searchInput.sendKeys("T-shirts", Keys.ENTER);
        orderPage.chooseOption().clickSizeBtn().clickColorBtn().clickAddToCartBtn();
        elementActions.scrollToTop(driver);
        orderPage.clickTheBasketBtn().clickProceedToCheckOutBtn();
        customerAccountPage.enterEmailForShipping(altynaiEmail.getCredentials());
        customerAccountPage.enterPasswordForShipping(altynaiPassword.getCredentials());
        customerAccountPage.clickTheLoginButtonForShipping();
        Thread.sleep(5000);
        customerAccountPage.enterCompany(fakeDataProvider.generateCompany())
                .enterStreetAddress(fakeDataProvider.generateStreetAddress())
                .enterCity(fakeDataProvider.generateCity());
        customerAccountPage.selectState()
                .enterZipPostCode(fakeDataProvider.generatePostalCode())
                .selectCountry();
        customerAccountPage.enterPhoneNumber(fakeDataProvider.generatePhoneNumber())
                .chooseMethodOfShipping();
        elementActions.clickButton(customerAccountPage.nextButton);


    }
}
