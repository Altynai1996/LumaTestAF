package LumaTests;
import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WhatsNewPageTest extends BaseTest {
    @Test(description = "What's new page verification")
    void shoppingOptionsSectionOnWomenPage() {
        driver.get("https://magento.softwaretestingboard.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-3")));
        whatsNewPage.clickTheButton();
        List<String> expectedOptions = Arrays.asList("NEW IN WOMEN'S", "Hoodies & Sweatshirts", "Jackets", "Tees", "Bras & Tanks", "Pants", "Shorts", "NEW IN MEN'S", "Hoodies & Sweatshirts", "Jackets", "Tees", "Tanks", "Pants", "Shorts");
        List<WebElement> newOptions = driver.findElements(By.xpath("//div[@class='sidebar sidebar-main']"));
        List<String> optionTexts = new ArrayList<>();
        for (WebElement element : newOptions) {
            optionTexts.add(element.getText());
        }
    }

    @Test(description = "Validate Shop New Yoga collection button.")
    void testShopNewYogaPageNavigation() {
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
        WebElement shopNewYogaButton = driver.findElement(By.xpath("//span[@class='more button']"));
        shopNewYogaButton.click();
        String forwardPageUrl = "https://magento.softwaretestingboard.com/collections/yoga-new.html";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, forwardPageUrl);
        String expectedTitle = "New Luma Yoga Collection";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(description = "Validate Performance Sportswear New button.")
    void testPerformanceSportswearNewPageNavigation() {
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
        WebElement performanceSportswearNewButton = driver.findElement(By.xpath("(//span[@class='content'])[2]"));
        performanceSportswearNewButton.click();
        String forwardPageUrl = "https://magento.softwaretestingboard.com/collections/performance-new.html";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, forwardPageUrl);
        String expectedTitle = "Performance Sportswear New";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(description = "Validate Eco Collection New button.")
    void testEcoCollectionNewPageNavigation() {
        driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
        WebElement performanceSportswearNewButton = driver.findElement(By.xpath("(//span[@class='content'])[3]"));
        performanceSportswearNewButton.click();
        String forwardPageUrl = "https://magento.softwaretestingboard.com/collections/eco-new.html";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, forwardPageUrl);
        String expectedTitle = "Eco Collection New";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}