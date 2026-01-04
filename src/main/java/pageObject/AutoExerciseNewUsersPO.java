package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseNewUsersPage extends BasePage {
    public AutoExerciseNewUsersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    private WebElement newUsersPageIsDisplayedLocator;
@FindBy(xpath = "//input[@placeholder='Name']")
private WebElement enterUserNameLocator;
@FindBy(xpath = "//input[@data-qa='signup-email']")
private WebElement enterEmailAddLocator;
@FindBy(xpath = "//button[normalize-space()='Signup']")
private WebElement clickOnSignupLocator;



    public boolean IsNewUsersPageDisplayed() {
        return newUsersPageIsDisplayedLocator.isDisplayed();
    }
    public void setEnterUserName(){
        enterUserNameLocator.sendKeys("solo");
    }
    public void setEnterEmailAddress(String email) {
        enterEmailAddLocator.sendKeys(generateRandomEmail());
    }
        private String generateRandomEmail(){
            return RandomStringUtils.random(4, true, true) + "@GMail.com";
    }
    public void clickOnSignUpButton(){
        clickOnSignupLocator.click();
    }


}



