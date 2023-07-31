package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
    @FindBy(xpath = "//div[@class='page-title-wrapper']")
    public WebElement profileTitle;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    public WebElement orderTitle;
}
