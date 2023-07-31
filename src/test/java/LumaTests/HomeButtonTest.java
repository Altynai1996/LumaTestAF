package LumaTests;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeButtonTest extends BaseTest {

    @Test(description ="Validate Home Button                                                                                                       ")
   void testHomePageNavigation() {
       driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
        WebElement homeButton = driver.findElement(By.linkText("Home"));
        homeButton.click();
        String baseUrl="https://magento.softwaretestingboard.com/";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, baseUrl);
    }
}
