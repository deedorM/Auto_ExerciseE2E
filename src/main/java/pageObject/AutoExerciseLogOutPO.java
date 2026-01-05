package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseLogOutPO extends BasePage {

    public AutoExerciseLogOutPO(WebDriver driver) {
        super(driver);
    }

     @FindBy(xpath = "//a[contains(.,'Logout')]")
    private WebElement clickOnLogOutLocator;

    public void clickOnLogOutButton(){
        clickOnLogOutLocator.click();
    }
}