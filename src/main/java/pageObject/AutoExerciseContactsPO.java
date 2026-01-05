package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseContactsPO extends BasePage {

    public AutoExerciseContactsPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    private WebElement getInTouchPageIsVisible;
    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement enterEmailAddressLocator;
    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement enterNameLocator;
    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement enterSubjectText;
    @FindBy(id = "message")
    private WebElement enterMessagesLocator;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement clickOnSubmitLocator;
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement getSuccessMessageIsVisible;
    @FindBy(xpath = "//span[contains(text(),' Home')]")
    private WebElement clickOnHomeLocator;
    @FindBy(xpath = "//div[@class='logo pull-left']")
    private WebElement IsLandedHomePageIsSuccessful;


    public boolean IsGetInTouchPageIsVisible() {
        return getInTouchPageIsVisible.isDisplayed();
    }

    public void EnterEmailAddress() {
        enterEmailAddressLocator.sendKeys("odexsolo007@gmail.com");
    }

    public void setEnterNameLocator() {
        enterNameLocator.sendKeys("solo");
    }

    public void EnterSubjectText() {
        enterSubjectText.sendKeys("Order Issues");
    }

    public void EnterYouQueryMessages() {
        enterMessagesLocator.sendKeys("Please unable to place my order with the payment gateway");
    }

    public void clickOnSubmitButton() {
        clickOnSubmitLocator.click();
    }

    public boolean IsGetSuccessMessageIsVisible() {
        return getSuccessMessageIsVisible.isDisplayed();
    }
    public void clickOnHomeButton(){
        clickOnHomeLocator.click();
    }
    public boolean LandedHomePageIsSuccessful(){
        return IsLandedHomePageIsSuccessful.isDisplayed();
    }
}