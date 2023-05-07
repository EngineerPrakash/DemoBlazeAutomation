package DemoBlazeAutomation.pages;

import DemoBlazeAutomation.domainobjects.BillingDetails;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;

public class PlaceOrderPage extends BasePage{
    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="name") private WebElement Name;
    @FindBy(id="country") private WebElement Country;
    @FindBy(id="city") private WebElement City;
    @FindBy(id="card") private WebElement Card;
    @FindBy(id="month") private WebElement Month;
    @FindBy(id="year") private WebElement Year;
    @FindBy(css=".btn-primary") private List<WebElement> purchase;

    @FindBy(css=".confirm")
    private WebElement okButton;

    @FindBy(css=".lead")
    private WebElement successMessage;

    @FindBy(id="totalm")
    private WebElement totalAmount;

    public PlaceOrderPage enterBillingName(String billingName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(Name));
        e.sendKeys(billingName);
        return this;
    }

    public PlaceOrderPage enterBillingCountry(String billingCountry){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(Country));
        e.sendKeys(billingCountry);
        return this;
    }

    public PlaceOrderPage enterBillingCity(String billingCity){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(City));
        e.sendKeys(billingCity);
        return this;
    }

    public PlaceOrderPage enterBillingCard(String billingCard){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(Card));
        e.sendKeys(billingCard);
        return this;
    }

    public PlaceOrderPage enterBillingMonth(String billingMonth){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(Month));
        e.sendKeys(billingMonth);
        return this;
    }

    public PlaceOrderPage enterBillingYear(String billingYear){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(Year));
        e.sendKeys(billingYear);
        return this;
    }

    public PlaceOrderPage clickPurchase(int Index){
        wait.until(ExpectedConditions.elementToBeClickable(purchase.get(Index))).click();
        return this;
    }

    public PlaceOrderPage setBillingDetails(BillingDetails billingDetails) {
        return enterBillingName(billingDetails.getName()).
                enterBillingCountry(billingDetails.getCountry()).
                enterBillingCity(billingDetails.getCity()).
                enterBillingCard(billingDetails.getCard()).
                enterBillingMonth(billingDetails.getMonth()).
                enterBillingYear(billingDetails.getYear());
    }

    public PlaceOrderPage takeScreenshot(){
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return null;
    }

    public void clickOk(){
        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
    }

    public String getSuccessMessage(){
        return wait.until(ExpectedConditions.visibilityOf(successMessage)).getText();
    }

    public String getTotalAmount(){
        return wait.until(ExpectedConditions.visibilityOf(totalAmount)).getText();
    }

}
