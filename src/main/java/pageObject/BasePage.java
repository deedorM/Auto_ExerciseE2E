package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {
    WebDriverWait wait;
    public BasePO(WebDriver driver){
        PageFactory.initElements(driver,this);
//        this.wait= new WebDriverWait(driver,10);
    }
    public void waitForVisibilityOfElemant(WebElement element){
        wait.until((ExpectedConditions.visibilityOf(element)));
    }
    public void selectFromDropDownByVisibilityOfText(WebElement element, String textName){
        waitForVisibilityOfElemant(element);
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }
}


