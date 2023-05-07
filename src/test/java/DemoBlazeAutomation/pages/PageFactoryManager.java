package DemoBlazeAutomation.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    private static ProductPage productPage;
    private static CartPage cartPage;

    private static PlaceOrderPage placeOrderPage;

    private static LoginPage loginPage;

    public static ProductPage getProductPage(WebDriver driver){
        return productPage == null ? new ProductPage(driver) : productPage;
    }

    public static CartPage getCartPage(WebDriver driver){
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static PlaceOrderPage getPlaceOrderPage(WebDriver driver){
        return placeOrderPage == null ? new PlaceOrderPage(driver) : placeOrderPage;
    }

    public static LoginPage getLoginPage(WebDriver driver){
        return loginPage == null ? new LoginPage(driver) : loginPage;
    }



}
