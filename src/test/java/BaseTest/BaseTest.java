package BaseTest;

import LumaTests.ComparisonProductsTest;
import com.digitalnomads.selenium.ui.configuration.FakeDataProvider;
import com.digitalnomads.selenium.ui.driversFactory.Driver;
import com.digitalnomads.selenium.ui.enums.ProductsForComparisonMessage;
import com.digitalnomads.selenium.ui.enums.RegistrationMessage;
import com.digitalnomads.selenium.ui.helper.ElementActions;
import com.digitalnomads.selenium.ui.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public ElementActions elementActions;
    public FakeDataProvider fakeDataProvider;
    public CustomerAccountPage customerAccountPage;
    public ProfilePage profilePage;
    public OrderPage orderPage;
    public ShoppingOptionsPage shoppingOptionsPage;
    public ComparisonPage comparisonPage;
    public WishListPage wishListPage;
    public WhatsNewPage whatsNewPage;
    public BasketPage basketPage;



    @BeforeClass
    public void Initializer() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        customerAccountPage = new CustomerAccountPage();
        fakeDataProvider = new FakeDataProvider();
        profilePage = new ProfilePage();
        orderPage = new OrderPage();
        shoppingOptionsPage = new ShoppingOptionsPage();
        comparisonPage = new ComparisonPage();
        wishListPage = new WishListPage();
        whatsNewPage = new WhatsNewPage();
        basketPage = new BasketPage();


    }
}

