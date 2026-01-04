package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseAccountRegistrationPO extends BasePage {

    public AutoExerciseAccountRegistrationPO (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    private WebElement accountCreatedPageIsDisplayed;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement clickOnContinueLocator;

    public boolean IsAccountCreatedPageDisplayed() {
        return accountCreatedPageIsDisplayed.isDisplayed();
    }

    public void clickOnContinueButton(){
        clickOnContinueLocator.click();
    }
}
