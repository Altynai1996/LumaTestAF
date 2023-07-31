package LumaTests;

import BaseTest.BaseTest;
import com.digitalnomads.selenium.ui.enums.ErrorMessage;
import com.digitalnomads.selenium.ui.enums.RegistrationMessage;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.digitalnomads.selenium.ui.enums.LoginCredentials.*;

public class RegistrationFunctionalityTest extends BaseTest {
    @Test(description = "User registration functionality")
    void loginWithValidCredentials() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//a[@href='https://magento.softwaretestingboard.com/customer/account/create/'])[1]")).click();
        customerAccountPage.enterFirstName(altynaiUserName.getCredentials())
                .enterLastName(altynaiLastName.getCredentials())
                .enterEmail(altynaiEmail.getCredentials())
                .enterPassword(altynaiPassword.getCredentials())
                .enterPasswordAndConfirm(altynaiPassword.getCredentials())
                .clickTheButton();
        Assert.assertEquals(customerAccountPage.registrationMessage.getText(), RegistrationMessage.registrationMessage);
    }

    @Test(description = "Login with valid email and password")
    void loginWithValidEmailPassword() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
        customerAccountPage.enterEmailForLogin(altynaiEmail.getCredentials())
                .enterPasswordForLogin(altynaiPassword.getCredentials())
                .clickTheSubmitButton();
        Assert.assertEquals(profilePage.profileTitle.getText(), "My Account");
    }

    @Test(description = "Login with invalid email")
    void loginWithInvalidUserName() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
        customerAccountPage.enterEmailForLogin(fakeDataProvider.generateUserEmail())
                .enterPasswordForLogin(altynaiPassword.getCredentials())
                .clickTheSubmitButton();
        Assert.assertEquals(customerAccountPage.errorMessageLoginIn.getText(), ErrorMessage.loginValidationError.getErrorMessage());
    }

    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
        customerAccountPage.enterEmailForLogin(altynaiEmail.getCredentials())
                .enterPasswordForLogin(fakeDataProvider.generatePassword())
                .clickTheSubmitButton();
        Assert.assertEquals(customerAccountPage.errorMessageLoginIn.getText(), ErrorMessage.loginValidationError.getErrorMessage());
    }

    @Test(dependsOnMethods = "Verification of the account information")
    void accountInformationVerification() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/");
        customerAccountPage.enterEmailForLogin(altynaiEmail.getCredentials())
                .enterPasswordForLogin(altynaiPassword.getCredentials())
                .clickTheSubmitButton();
        String blockText = customerAccountPage.accountInfoBlock.getText();
        Assert.assertTrue(blockText.contains("Alya Tulenbaeva") && blockText.contains("fought-board@u96jrbpx.mailosaur.net"),
                "Account information contains correct data.");
        }
    }
