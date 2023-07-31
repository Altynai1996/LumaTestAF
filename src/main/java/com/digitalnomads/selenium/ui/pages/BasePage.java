package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.driversFactory.Driver;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    public ElementActions elementActions = new ElementActions();
}
