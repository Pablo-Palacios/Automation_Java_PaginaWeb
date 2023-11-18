package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

    }


    public void click(By locator){

        WebElement element  =  wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();

    }

    public String getText(By locator){

        WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();

    }

    public Boolean isDisplayed(By locator){

        WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.isDisplayed();
    }

    public void sendKeys(By locator, String text){

        WebElement element  =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
}
