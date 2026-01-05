package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pageObject.*;
import utilities.PropertyReaders;
import java.io.IOException;
import static StepDefinition.Hooks.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoExerciseSteps {

    AutoExerciseHomePO HomePO = new AutoExerciseHomePO(driver);
    AutoExerciseNewUsersPO NewUsersPO = new AutoExerciseNewUsersPO(driver);
    AutoExerciseEnterAccountInfoPO EnterAccountInfoPO = new AutoExerciseEnterAccountInfoPO(driver);
    AutoExerciseAccountCreatedPO AccountCreatedPO = new AutoExerciseAccountCreatedPO(driver);
    AutoExerciseLoginPO LoginPO =  new AutoExerciseLoginPO(driver);

    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() throws IOException, InterruptedException {
        PropertyReaders propReaders = new PropertyReaders();
        driver.get(propReaders.getAutoExercise_Url());
        driver.findElement(By.xpath("//p[@class='fc-button-label' and text()='Consent']")).click();
    }

    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        assertThat(HomePO.IsHomePageDisplayed(),equalTo(true));
    }

    @Then("Click on {string} button")
    public void click_on_button(String string) {
       HomePO.setClickOnLoginLocator();
    }

    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        NewUsersPO.IsNewUsersPageDisplayed();
    }

    @Then("I Enter {string} and {string}")
    public void i_enter_and(String name, String email) {
        NewUsersPO.setEnterUserName();
        NewUsersPO.setEnterEmailAddress(email);
    }

    @Then("Click {string} button")
    public void click_button(String string) throws InterruptedException {
        NewUsersPO.clickOnSignUpButton();
    }

    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        assertThat(EnterAccountInfoPO.IsAccountInfoPageDisplayed(), equalTo(true));
    }

    @When("Fill details: Title, {string} and {string}")
    public void fill_details_title_and(String pswd, String dob) {
        EnterAccountInfoPO.clickOnTitleButton();
        EnterAccountInfoPO.setEnterPassWord(pswd);
        EnterAccountInfoPO.setEnterDayOfBirth();
        EnterAccountInfoPO.setEnterMonthOfBirth();
    }

    @When("Select checkbox {string}")
    public void select_checkbox(String string)  {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,300);");
        EnterAccountInfoPO.clickOnNewsLetterButton();
        EnterAccountInfoPO.clickOnOfferButton();
    }

    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String fN, String lN, String cN, String aN, String coN,
                             String stN, String ctN, String cdNum, String moNum) {
       EnterAccountInfoPO.setEnterFirstName();
       EnterAccountInfoPO.setEnterLastName();
       EnterAccountInfoPO.setEnterCompanyName();
       EnterAccountInfoPO.setEnterAddressName();
       EnterAccountInfoPO.setEnterCountryName();
       EnterAccountInfoPO.setEnterSateName();
       EnterAccountInfoPO.setEnterCityName();
       EnterAccountInfoPO.setEnterZipCodeNumber();
       EnterAccountInfoPO.setEnterMobileNumber();
    }

    @When("Click {string}")
    public void click(String string) {
      EnterAccountInfoPO.clickOnCreateAccountButton();
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        assertThat(AccountCreatedPO.IsAccountCreatedPageDisplayed(), equalTo(true));
    }

    @Then("Click Continue button")
    public void click_continue_button() {
        AccountCreatedPO.clickOnContinueButton();
    }

    @Then("Verify logged in as user {string} is visible")
    public void verify_logged_in_as_user_is_visible(String string) {
        assertThat(LoginPO.IsLoginIconVisible(), equalTo(true));
    }
}