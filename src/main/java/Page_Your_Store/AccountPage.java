package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    public WebDriver driver;

    public WebDriverWait wait;


    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    By AccountBy = By.xpath("//div[@id='content']/h1");

    By firstNameBy = By.id("input-firstname");

    By lastNameBy = By.id("input-lastname");

    By emailBy = By.id("input-email");
    By telefhoneBy = By.id("input-telephone");

    By passwordBy = By.id("input-password");

    By confirmPasswordBy = By.id("input-confirm");

    By agreeBy = By.xpath("//div[@class='pull-right']/input[contains(@name, 'agree')]");


    By continuenBy = By.xpath("//div[@class='pull-right']/input[contains(@value, 'Continue')]");


    By confirmRegisterBy = By.xpath("//div[@id='content']/p[text()='Congratulations! Your new account has been successfully created!']");

    public String getTitulo(){

        WebElement accountTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(AccountBy));

        return accountTitleElement.getText();

    }


    public void formularioPersonal_Details(String firstName, String lastName, String email, String telefhone){

        WebElement firstElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameBy));

        firstElemnt.clear();

        firstElemnt.sendKeys(firstName);



        WebElement lastElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameBy));

        lastElemnt.clear();

        lastElemnt.sendKeys(lastName);



        WebElement emailElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));

        emailElemnt.clear();

        emailElemnt.sendKeys(email);



        WebElement phoneElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(telefhoneBy));

        phoneElemnt.clear();

        phoneElemnt.sendKeys(telefhone);


    }

    public void formularioPassword(String password, String comfir){

        WebElement passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordBy));

        passwordElement.clear();

        passwordElement.sendKeys(password);



        WebElement comfirElement = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordBy));

        comfirElement.clear();

        comfirElement.sendKeys(comfir);


    }

    public void agreeBox(){

        WebElement agreeElement = wait.until(ExpectedConditions.elementToBeClickable(agreeBy));

        agreeElement.click();


    }

    public void continueButton(){

        WebElement continueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(continuenBy));

        continueElement.click();

    }

    public String textConfirmRegister(){

        WebElement confirmElement = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmRegisterBy));

        return confirmElement.getText();


    }










}
