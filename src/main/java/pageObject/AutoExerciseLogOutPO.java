package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseLogOutPage extends BasePage {
    public AutoExerciseLogOutPage(WebDriver driver) {
        super(driver);
    }




     @FindBy(xpath = "//a[contains(.,'Logout')]")
    private WebElement clickOnLogOutLocator;



    public void clickOnLogOutButton(){
        clickOnLogOutLocator.click();
    }


}



