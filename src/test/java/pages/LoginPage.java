package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LogUtility;

public class LoginPage extends BasePage {
    @FindBy (xpath = "//button[@ng-click='manager()']")
    private WebElement bankManagerElement;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void logInBankManager (){
        bankManagerElement.click();
       LogUtility.infoLog("The user clicked on bank manager button");
    }
}
