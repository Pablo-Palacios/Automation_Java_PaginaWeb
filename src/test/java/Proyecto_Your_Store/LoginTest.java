package Proyecto_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends Base {

    @Test
    public void login(){

        getDriver().get("https://opencart.abstracta.us/");

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));


        By AccountButton = By.className("dropdown");

        By AccountLista = By.xpath("//li/ul/li/a[@href='https://opencart.abstracta.us:443/index.php?route=account/login']");

        By loginCustomer = By.id("account-login");





        WebElement AccountButtonElement  =  wait.until(ExpectedConditions.elementToBeClickable(AccountButton));

        AccountButtonElement.click();

        WebElement AccountlistaElement  =  wait.until(ExpectedConditions.elementToBeClickable(AccountLista));

        AccountlistaElement.click();


        WebElement loginCustomerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginCustomer));




        Assert.assertTrue(loginCustomerElement.isDisplayed());


        By loginName = By.id("input-email");

        By loginPassword = By.id("input-password");

        By loginButton = By.xpath("//input[@class='btn btn-primary']");


        WebElement loginNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginName));

        loginNameElement.sendKeys("pmpmatador@gmail.com");

        WebElement loginPasswordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(loginPassword));

        loginPasswordElement.sendKeys("Pablo1234");

        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));



        loginButtonElement.click();


        By myAccount = By.xpath("//div[@id='content']/h2[text() = 'My Account']");

        WebElement myAccountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccount));

        Assert.assertEquals(myAccountElement.getText(), "My Account", "No se inscribio correctamente");




































    }












}
