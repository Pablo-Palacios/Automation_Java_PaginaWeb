package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {


    public WebDriver driver;

    public WebDriverWait wait;


    By loginName = By.id("input-email");

    By loginPassword = By.id("input-password");

    By loginButton = By.xpath("//input[@class='btn btn-primary']");

    By alertLogin = By.className("alert-dismissible");

    By returningBy = By.xpath("//div[@class='well']/h2[text() = 'Returning Customer']");




    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public void usuarioLogin(String username, String password){

        WebElement loginNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginName));

        loginNameElement.sendKeys(username);

        WebElement loginPasswordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginPassword));

        loginPasswordElement.sendKeys(password);

        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        loginButtonElement.click();



    }

    public boolean alertErrorLogin(){

        WebElement alertElement = wait.until(ExpectedConditions.visibilityOfElementLocated(alertLogin));
        return alertElement.isDisplayed();

    }

    public String tituReturningCust(){
        WebElement returningElement = wait.until(ExpectedConditions.visibilityOfElementLocated(returningBy));
        return returningElement.getText();
    }


}
