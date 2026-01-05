package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseHomePO extends BasePage {

    public AutoExerciseHomePO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    private WebElement homePageIsDisplayedLocator;
    @FindBy(xpath = "//a[@href='/login']")
    private WebElement clickOnLoginLocator;
    @FindBy(linkText = "Logged in as solo")
    private WebElement userNamePageIsVisible;
    @FindBy(xpath = "//a[@href='/contact_us']")
    private WebElement clickOnContactUsLocator;
    @FindBy(xpath = " //a[contains(text(),'Test Cases')]")
    private WebElement clickOnTestCasesLocator;
    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement userNavigatesToTC;


    public boolean IsHomePageDisplayed() {
        return homePageIsDisplayedLocator.isDisplayed();
    }

    public void setClickOnLoginLocator() {
        clickOnLoginLocator.click();
    }

    public boolean IsUserNameVisible() {
        return userNamePageIsVisible.isDisplayed();
    }

    public void clickOnContactButton(){
        clickOnContactUsLocator.click();
    }
    public void clickOnTestCasesButton(){
        clickOnTestCasesLocator.click();
    }
    public boolean userNavigatesToTestCasesIsSuccessful(){
        return userNavigatesToTC.isDisplayed();
    }
}