package DemoBlazeAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(id = "itemc")
    private List<WebElement> prodCategory;

    @FindBy(linkText="Sony vaio i5")
    private WebElement productNameSony;

    @FindBy(linkText="Dell i7 8gb")
    private WebElement productNameDell;

    @FindBy(css=".btn-success")
    private WebElement addToCart;

    @FindBy(partialLinkText="Home")
    private WebElement homeButton;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectProdCategory(int index){
        wait.until(ExpectedConditions.elementToBeClickable(prodCategory.get(index))).click();
    }

    public void addProduct(){
        wait.until(ExpectedConditions.elementToBeClickable(productNameSony)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
       homeButton.click();
    }

    public void addProductDell(){
        wait.until(ExpectedConditions.elementToBeClickable(productNameDell)).click();
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
       homeButton.click();
    }
}
