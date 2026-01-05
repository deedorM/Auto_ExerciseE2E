package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseLoginPO extends BasePage {
    public AutoExerciseLoginPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement enterLoginEmailAddLocator;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement enterPassWordLocator;
    @FindBy(tagName = "button")
    private WebElement clickOnLoginLocator;
    @FindBy(xpath = "//a[.//i[contains(@class,'fa-user')] and contains(normalize-space(),'Logged in as')]")
    private WebElement successfulLoginIconLocator;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement wrongLoginEmailAddLocator;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement wrongPassWordLocator;
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement errorMessageIsVisible;


    public void EnterLoginEmailAddress(String email) {
        enterLoginEmailAddLocator.sendKeys("xoxo007@gmail.com");
    }

    public void setEnterPassWord() {
        enterPassWordLocator.sendKeys("xxxzz777");
    }

    public void clickOnLoginButton() {
        clickOnLoginLocator.click();
    }

    public boolean IsLoginIconVisible() {
        return successfulLoginIconLocator.isDisplayed();
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