package DemoBlazeAutomation.stepdefinations;

import DemoBlazeAutomation.constants.EndPoint;
import DemoBlazeAutomation.context.TestContext;
import DemoBlazeAutomation.pages.LoginPage;
import DemoBlazeAutomation.pages.PageFactoryManager;
import DemoBlazeAutomation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginDemoStepDefinitions {

    private final ProductPage productPage;

    private final LoginPage loginPage;

    private final TestContext context;

    public LoginDemoStepDefinitions(TestContext context) {
        this.context = context;
        productPage = PageFactoryManager.getProductPage(context.driver);
        loginPage = PageFactoryManager.getLoginPage(context.driver);

    }

    @Given("I open the demo blaze application with url")
    public void iopenthedemoblazeapplicationwithurl() {
        productPage.load(EndPoint.HOME.url);
    }

    @When("I click the Sign Up")
    public void iclickthesignup() {
        loginPage.clickLogin();
    }

    @And("I enter the username and Password")
    public void iEnterTheUsernameAndPassword() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.loginToDemoApplication("Demoprakash","Demo123");
    }

    @Then("the sign up of the application should be successful with message")
    public void theSignUpOfTheApplicationShouldBeSuccessfulWithMessage() throws InterruptedException {
        Thread.sleep(5000);
        String username = loginPage.getUserName();
        Assert.assertEquals(username, "Welcome Demoprakash", "username is not correct");
    }

}
