package com.digitalnomads.selenium.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPage extends BasePage {
    @FindBy(id= "ui-id-3")
    public WebElement whatsNewButton;
    @FindBy(xpath = "//div[@class='sidebar sidebar-main']")
    public WebElement optionsBlock;

    public WhatsNewPage clickTheButton() {
        elementActions.clickButton(whatsNewButton);
        return this;
    }
}
