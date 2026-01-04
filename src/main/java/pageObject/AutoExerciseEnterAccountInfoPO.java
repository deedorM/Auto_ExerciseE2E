package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseEnterAccountInfoPage extends BasePage {
    public AutoExerciseEnterAccountInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    private WebElement enterAccountPageIsDisplayedLocator;
    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement clickOnTitleLocator;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement enterPassWordLocator;
    @FindBy(id = "days")
    private WebElement enterDayOfBirthLocator;
    @FindBy(id = "months")
    private WebElement enterMonthOfBirthLocator;
    @FindBy(id = "years")
    private WebElement enterYearOfBirthLocator;
    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement clickOnNewsLetterLocator;
    @FindBy(xpath = "//input[@id='optin']")
    private WebElement clickOnOfferLocator;
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement enterFirstNameLocator;
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement enterLastNameLocator;
    @FindBy(xpath = "//input[@id='company']")
    private WebElement enterCompanyNameLocator;
    @FindBy(xpath = "//input[@id='address1']")
    private WebElement enteraddressLocator;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement enterCountryNameLocator;
    @FindBy(xpath = "//input[@id='state']")
    private WebElement enterStateNameLocator;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement enterCityNameLocator;
    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement enterZipCodeLocator;
    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement enterMobileNumberLocator;
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    private WebElement clickOnCreateLocator;


    public boolean IsAccountInfoPageDisplayed() {
        return enterAccountPageIsDisplayedLocator.isDisplayed();
    }
    public void clickOnTitleButton(){
        clickOnTitleLocator.click();
    }
    public void setEnterPassWord(String pwd){
        enterPassWordLocator.sendKeys("Yahoo77");
    }
    public void setEnterDayOfBirth(){
        enterDayOfBirthLocator.sendKeys("15");
    }
    public void setEnterMonthOfBirth(){
        enterMonthOfBirthLocator.sendKeys("02");
    }
    public void setEnterYearOfBirth(){
        enterYearOfBirthLocator.sendKeys("1990");
    }
    public void clickOnNewsLetterButton(){
        clickOnNewsLetterLocator.click();
    }
    public void clickOnOfferButton(){
        clickOnOfferLocator.click();
    }
    public void setEnterFirstName(){
        enterFirstNameLocator.sendKeys("solomon");
    }
    public void setEnterLastName(){
        enterLastNameLocator.sendKeys("odele");
    }
    public void setEnterCompanyName(){
        enterCompanyNameLocator.sendKeys("eledavibes");
    }
    public void setEnterAddressName(){
        enteraddressLocator.sendKeys("60 brega");
    }
    public void setEnterCountryName(){
        enterCountryNameLocator.sendKeys("Canada");
    }
    public void setEnterSateName(){
        enterStateNameLocator.sendKeys("Dublin");
    }
    public void setEnterCityName(){
        enterCityNameLocator.sendKeys("Balbriggan");
    }
    public void setEnterZipCodeNumber(){
        enterZipCodeLocator.sendKeys("k32");
    }
    public void setEnterMobileNumber(){
        enterMobileNumberLocator.sendKeys("0899736888");
    }
    public void clickOnCreateAccountButton(){
        clickOnCreateLocator.click();
    }


}



