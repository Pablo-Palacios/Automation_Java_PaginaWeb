package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class myAccountPage {


    public WebDriver driver;

    public WebDriverWait wait;



    By myAccount = By.xpath("//div[@id='content']/h2[text() = 'My Account']");

    public myAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public String getTitulo() {
        WebElement myAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccount));
        return myAccountElement.getText();
    }
}
