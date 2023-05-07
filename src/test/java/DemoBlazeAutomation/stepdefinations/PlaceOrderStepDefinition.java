package DemoBlazeAutomation.stepdefinations;

import DemoBlazeAutomation.context.TestContext;
import DemoBlazeAutomation.domainobjects.BillingDetails;
import DemoBlazeAutomation.pages.PageFactoryManager;
import DemoBlazeAutomation.pages.PlaceOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlaceOrderStepDefinition {

    private final PlaceOrderPage placeOrderPage;
    private BillingDetails billingDetails;
    private final TestContext context;

    public PlaceOrderStepDefinition(TestContext context){
        this.context = context;
        placeOrderPage =PageFactoryManager.getPlaceOrderPage(context.driver);
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        this.billingDetails=billingDetails;
    }
    @When("I fill the Billing details and click purchase")
    public void iFillTheBillingDetailsAndClickPurchase() throws InterruptedException {
        Thread.sleep(5000);
        placeOrderPage.setBillingDetails(billingDetails);
        placeOrderPage.clickPurchase(2);

    }

    @Then("the purchase id and amount should appear")
    public void thePurchaseIdAndAmountShouldAppear() {
        placeOrderPage.takeScreenshot();
        String successText=placeOrderPage.getSuccessMessage();
        String finalAmount= successText.substring(20,23);
        System.out.println(successText);
        System.out.println(finalAmount);
        String amount=placeOrderPage.getTotalAmount();
        String AmountNumber=amount.substring(7,10);
        Assert.assertEquals(AmountNumber,finalAmount,"Amount Does not matches");
        placeOrderPage.clickOk();
    }

}
