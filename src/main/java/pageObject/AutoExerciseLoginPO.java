package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseLoginPage extends BasePage {
    public AutoExerciseLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement enterLoginEmailAddLocator;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement enterPassWordLocator;
    @FindBy(tagName = "button")
    private WebElement clickOnLoginLocator;
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    private WebElement loginPageIsDisplayedLocator;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement wrongLoginEmailAddLocator;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement wrongPassWordLocator;
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement errorMessageIsVisible;


    public void EnterLoginEmailAddress(String email) {
        enterLoginEmailAddLocator.sendKeys("odexsolo007@gmail.com");
    }

    public void setEnterPassWord() {
        enterPassWordLocator.sendKeys("Yahoo777");
    }

    public void clickOnLoginButton() {
        clickOnLoginLocator.click();
    }

    public boolean IsLoginPageIsVisible() {
        return loginPageIsDisplayedLocator.isDisplayed();

    }

    public void EnterWrongLogEmailAddress() {
        enterLoginEmailAddLocator.sendKeys("odexsol77@gmail.com");
    }

    public void wrongEnterPassWord() {
        enterPassWordLocator.sendKeys("Yaho70");
    }
    public boolean errorMessageIsVisible(){
        return errorMessageIsVisible.isDisplayed();
    }

}