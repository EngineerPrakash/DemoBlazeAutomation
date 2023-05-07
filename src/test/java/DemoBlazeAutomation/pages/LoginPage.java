package DemoBlazeAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login2")
    private WebElement loginNavPanel;

    @FindBy(id = "loginusername")
    private WebElement loginUsername;

    @FindBy(id = "loginpassword")
    private WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private  WebElement loginBtn;

    @FindBy(id="nameofuser")
    private WebElement userNamePanel;

    public void loginToDemoApplication(String username,String password){
        wait.until(ExpectedConditions.visibilityOf(loginUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(loginPassword)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public void clickLogin(){
        wait.until(ExpectedConditions.visibilityOf(loginNavPanel)).click();
    }

    public String getUserName(){
      return wait.until(ExpectedConditions.visibilityOf(userNamePanel)).getText();
    }

}
