package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = System.getProperty("browser", "edge");

            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().clearDriverCache().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                default:
                    WebDriverManager.edgedriver().clearDriverCache().setup();
                    driver = new EdgeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver() {
            driver.quit();
        }
    }