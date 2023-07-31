package com.digitalnomads.selenium.ui.pages;

import com.digitalnomads.selenium.ui.helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends BasePage{
    @FindBy(xpath = "(//img[@class='product-image-photo'])[1]")
    public WebElement menTop1;
    @FindBy(xpath = "(//img[@class='product-image-photo'])[2]")
    public WebElement menTop2;
    @FindBy(xpath = "(//span[text()='Add to Compare'])[1]")
    public WebElement addToCompareButton;
    @FindBy(xpath = "//div[@class='message-success success message']")
    public WebElement messageAfterAddingToCompare;
    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/catalog/product_compare/']")
    public WebElement comparisonList;


    public ComparisonPage chooseOption(WebElement element){
        elementActions.clickButton(element);
        return this;
    }

    public ComparisonPage clickAddToCompareButton() {
        addToCompareButton.click();
        return this;
    }
}
