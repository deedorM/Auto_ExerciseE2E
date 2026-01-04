package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExerciseProductsPage extends BasePage {
    public AutoExerciseProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),' Products')]")
    private WebElement clickOnProductsLocator;
    @FindBy(xpath = "//h2[@class='title text-center']")
    private WebElement IsProductsPageIsVisible;
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    private WebElement clickViewProductLocatorr;



    public void clickOnProductsButton(){
        clickOnProductsLocator.click();
    }

    public boolean ProductsPageIsVisible() {
       return IsProductsPageIsVisible.isDisplayed();
    }

    public void clickOnViewProductButton() {
        clickOnProductsLocator.click();
    }





}


