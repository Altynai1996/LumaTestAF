package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class CustomerAccountPage extends BasePage {
    @FindBy(id = "firstname")
    public WebElement userFirstName;
    @FindBy(id = "lastname")
    public WebElement userLastName;
    @FindBy(xpath = "//input[@name='is_subscribed']")
    public WebElement signUpForNewsLetterInput;
    @FindBy(id = "email_address")
    public WebElement userEmail;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement userPassword;
    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAccountBtn;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement registrationMessage;
    @FindBy(id = "send2")
    public WebElement loginBtn;
    @FindBy(xpath = "//input[@name='login[username]']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement loginPassword;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement errorMessageLoginIn;
    @FindBy(xpath = "//button[@class='action login primary']")
    public WebElement submitButton;
    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyInput;
    @FindBy(xpath = "//input[@name='street[0]']")
    public WebElement streetAddressInput;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;
    @FindBy(xpath = "(//select[@class='select'])[1]")
    public WebElement selectStateInput;
    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement zipPostCodeInput;
    @FindBy(xpath = "(//input[@class='input-text'])[12]")
    public WebElement phoneNumberInput;
    @FindBy(xpath = "(//select[@class='select'])[1]")
    public WebElement selectCountryInput;
    @FindBy(xpath = "//input[@class='radio']")
    public WebElement shippingMethods;
    @FindBy(xpath = "(//input[@id='customer-email'])[1]")
    public WebElement emailInputForShipping;
    @FindBy(id = "customer-password")
    public WebElement passwordInputForShipping;
    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginButtonForShipping;
    @FindBy(xpath = "(//div[@class='box-content'])[1]")
    public WebElement accountInfoBlock;

    @FindBy(xpath = "//button[@class='button action continue primary']")
    public WebElement nextButton;


    public CustomerAccountPage enterFirstName(String firstName) {
        elementActions.writeText(userFirstName, firstName);
        return this;
    }

    public CustomerAccountPage enterLastName(String lastName) {
        elementActions.writeText(userLastName, lastName);
        return this;
    }


    public CustomerAccountPage enterEmail(String email) {
        elementActions.writeText(userEmail, email);
        return this;
    }

    public CustomerAccountPage enterPassword(String password) {
        elementActions.writeText(userPassword, password);
        return this;
    }

    public CustomerAccountPage enterPasswordAndConfirm(String password) {
        confirmPassword.sendKeys(password);
        return this;
    }

    public CustomerAccountPage clickTheButton() {
        createAccountBtn.click();
        return this;
    }

    public CustomerAccountPage enterEmailForLogin(String email) {
        elementActions.writeText(loginEmail, email);
        return this;
    }

    public CustomerAccountPage enterPasswordForLogin(String password) {
        elementActions.writeText(loginPassword, password);
        return this;
    }

    public CustomerAccountPage clickTheSubmitButton() {
        submitButton.click();
        return this;
    }

    public CustomerAccountPage selectState() {
        Select select = new Select(selectStateInput);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int index = random.nextInt(options.size());
        select.selectByIndex(index);
        return this;
    }


    public CustomerAccountPage selectCountry() {
        Select select = new Select(selectCountryInput);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int index = random.nextInt(options.size());
        select.selectByIndex(index);
        return this;
    }

    public CustomerAccountPage enterCompany(String company) {
        elementActions.writeText(companyInput, company);
        return this;
    }

    public CustomerAccountPage enterStreetAddress(String street) {
        elementActions.writeText(streetAddressInput, street);
        return this;
    }

    public CustomerAccountPage enterCity(String city) {
        elementActions.writeText(cityInput, city);
        return this;
    }

    public CustomerAccountPage enterZipPostCode(String postCode) {
        elementActions.writeText(zipPostCodeInput, postCode);
        return this;
    }

    public CustomerAccountPage enterPhoneNumber(String phoneNumber) {
        elementActions.writeText(phoneNumberInput, phoneNumber);
        return this;
    }

    public CustomerAccountPage chooseMethodOfShipping() {
        elementActions.clickButton(shippingMethods);
        return this;
    }

    public CustomerAccountPage enterEmailForShipping(String email) {
        elementActions.writeText(emailInputForShipping, email);
        return this;
    }

    public CustomerAccountPage enterPasswordForShipping(String password) {
        elementActions.writeText(passwordInputForShipping, password);
        return this;
    }

    public CustomerAccountPage clickTheLoginButtonForShipping() {
        elementActions.clickButton(loginButtonForShipping);
        return this;
    }
}

