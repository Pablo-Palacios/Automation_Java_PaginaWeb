package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {



    public WebDriver driver;

    public WebDriverWait wait;



    By titulo = By.xpath("//div[@id='logo']/h1/a");

    By AccountButton = By.xpath("//li[@class='dropdown']/a[contains(@href, 'account/account')]");

    By AccountLogin = By.xpath("//a[contains(@href, 'account/login')]");






    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }


    public String getTitulo() {
        WebElement tituloElement = wait.until(ExpectedConditions.visibilityOfElementLocated(titulo));
        return tituloElement.getText();
    }

    public void ingresarLogin(){


        WebElement AccountButtonElement  =  wait.until(ExpectedConditions.elementToBeClickable(AccountButton));

        AccountButtonElement.click();

        WebElement AccountLoginElement = wait.until(ExpectedConditions.elementToBeClickable(AccountLogin));

        AccountLoginElement.click();
        

    }



}
