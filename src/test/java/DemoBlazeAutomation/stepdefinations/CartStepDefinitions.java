package DemoBlazeAutomation.stepdefinations;

import DemoBlazeAutomation.context.TestContext;
import DemoBlazeAutomation.domainobjects.BillingDetails;
import DemoBlazeAutomation.pages.CartPage;
import DemoBlazeAutomation.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {

    private final CartPage cartPage;

    private final TestContext context;

    private BillingDetails billingDetails;

    public CartStepDefinitions(TestContext context){
        this.context = context;
        cartPage =PageFactoryManager.getCartPage(context.driver);
    }

    @Then("the laptops should be added to the cart")
    public void theLaptopsShouldBeAddedToTheCart() throws InterruptedException {
        cartPage.deleteProduct();
        String actualProd=cartPage.getProductTitle();
        //   Assert.assertEquals(actualProd,"Sony vaio i5","Does not matches");
    }

    @And("I click on the place Order")
    public void iClickOnThePlaceOrder() {
        cartPage.clickPlaceOrder();
    }

}
