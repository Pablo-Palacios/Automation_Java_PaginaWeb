package Page_Your_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    By loginNameBy = By.id("input-email");

    By loginPasswordBy = By.id("input-password");

    By loginButtonBy = By.xpath("//input[@class='btn btn-primary']");

    By alertLoginBy = By.className("alert-dismissible");


    By newCustomerTitleBy = By.xpath("//h2[text()='New Customer']");

    By returningCustomerTitleBy = By.xpath("//h2[text()='Returning Customer']");



    public LoginPage(WebDriver driver) {
        super(driver);

    }


    public void usuarioLogin(String username, String password){

        sendKeys(loginNameBy, username);
        sendKeys(loginPasswordBy, password);

    }

    public void loginButton(){

        click(loginButtonBy);

    }

    public boolean alertErrorLogin(){

        return isDisplayed(alertLoginBy);

    }



    public String titleNewCustomer(){

        return getText(newCustomerTitleBy);

    }


    public String titleReturningCustomer(){

        return getText(returningCustomerTitleBy);

    }





}
