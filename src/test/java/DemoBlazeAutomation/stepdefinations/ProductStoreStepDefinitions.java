package DemoBlazeAutomation.stepdefinations;

import DemoBlazeAutomation.constants.EndPoint;
import DemoBlazeAutomation.context.TestContext;
import DemoBlazeAutomation.domainobjects.BillingDetails;
import DemoBlazeAutomation.pages.CartPage;
import DemoBlazeAutomation.pages.PageFactoryManager;
import DemoBlazeAutomation.pages.PlaceOrderPage;
import DemoBlazeAutomation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductStoreStepDefinitions {

    private final ProductPage productPage;
    private final CartPage cartPage;
    private BillingDetails billingDetails;

    private final PlaceOrderPage placeOrderPage;
    private final TestContext context;

    public ProductStoreStepDefinitions(TestContext context){
        this.context = context;
        productPage = PageFactoryManager.getProductPage(context.driver);
        cartPage =PageFactoryManager.getCartPage(context.driver);
        placeOrderPage =PageFactoryManager.getPlaceOrderPage(context.driver);
    }

    @Given("I'm on the Product Store Page")
    public void iMOnTheStorePage() {
        productPage.load(EndPoint.HOME.url);
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart() {
        productPage.selectProdCategory(1);
    }

    @Then("I should see {string} in the cart")
    public void iShouldSeeInTheCart(String arg0) {
    }

    @When("I select the category as Laptops")
    public void iSelectTheCategoryAsLaptops() {
        productPage.selectProdCategory(1);
    }

    @And("I Select Sony Vaio laptop")
    public void iSelectSonyVaioLaptop() {
        productPage.addProduct();
    }

    @And("I Select Dell laptop")
    public void iSelectDellLaptop() {
        productPage.selectProdCategory(1);
        productPage.addProductDell();
    }

}
