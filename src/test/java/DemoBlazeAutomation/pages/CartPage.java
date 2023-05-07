package DemoBlazeAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"tbodyid\"]/tr/td[2]") private WebElement productTitle;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[4]/a") private WebElement deleteProduct;

    @FindBy(partialLinkText = "Cart")
    private WebElement cartButton;

    @FindBy(css = ".btn-success")
    private WebElement placeOrderButton;




    public String getProductTitle() throws InterruptedException{
        Thread.sleep(5000);
        return wait.until(ExpectedConditions.visibilityOf(productTitle)).getText();
    }

    public void deleteProduct() throws InterruptedException {
         cartButton.click();
         Thread.sleep(5000);
         wait.until(ExpectedConditions.elementToBeClickable(deleteProduct)).click();
    }

    public void clickPlaceOrder(){
        wait.until(ExpectedConditions.visibilityOf(placeOrderButton)).click();
    }




}
