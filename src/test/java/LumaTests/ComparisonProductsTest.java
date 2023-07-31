package LumaTests;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class ComparisonProductsTest extends BaseTest {
    @Test(description = "Validate the Compare Products feature")
    void compareProductsTest() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        comparisonPage.chooseOption(comparisonPage.menTop1)
                .clickAddToCompareButton();
        for(int i=0; i<2;i++) {
            driver.navigate().back();
        }
        comparisonPage.chooseOption(comparisonPage.menTop2)
                .clickAddToCompareButton();
        comparisonPage.comparisonList.click();
        List<WebElement> comparedProducts = driver.findElements(By.id("product-comparison"));
        boolean product1 = comparedProducts.stream().anyMatch(e -> e.getText().contains("Cassius Sparring Tank"));
        boolean product2 = comparedProducts.stream().anyMatch(e -> e.getText().contains("Atlas Fitness Tank"));
        Assert.assertTrue(product1, "Product 1 not found in the comparison list.");
        Assert.assertTrue(product2, "Product 2 not found in the comparison list.");
    }
    }

